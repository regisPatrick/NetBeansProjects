/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.agendalive.controller;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.service.LiveService;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author user
 */
@CrossOrigin(origins = "*")
@RestController
public class LiveController {
    
    @Autowired
    LiveService liveService;
    
    @GetMapping("/lives")
    public ResponseEntity<Page<LiveDocument>> getAllLives(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                          @RequestParam(required = false) String flag){
        
        Page<LiveDocument> livePage = liveService.findAll(pageable, flag);
        if(livePage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<Page<LiveDocument>>(livePage, HttpStatus.OK);
        }
        
    }
    
        @GetMapping("/lives/{id}")
    public ResponseEntity<LiveDocument> getOneLive(@PathVariable(value="id") String id){
        Optional<LiveDocument> liveO = liveService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<LiveDocument>(liveO.get(), HttpStatus.OK);
        }
    }

    @PostMapping("/lives")
    public ResponseEntity<LiveDocument> saveLive(@RequestBody @Valid LiveDocument live) {
        live.setRegistrationDate(LocalDateTime.now());
        return new ResponseEntity<LiveDocument>(liveService.save(live), HttpStatus.CREATED);
    }

    @DeleteMapping("/lives/{id}")
    public ResponseEntity<?> deleteLive(@PathVariable(value="id") String id) {
        Optional<LiveDocument> liveO = liveService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            liveService.delete(liveO.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PutMapping("/lives/{id}")
    public ResponseEntity<LiveDocument> updateLive(@PathVariable(value="id") String id,
                                                      @RequestBody @Valid LiveDocument liveDocument) {
        Optional<LiveDocument> liveO = liveService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            liveDocument.setId(liveO.get().getId());
            return new ResponseEntity<LiveDocument>(liveService.save(liveDocument), HttpStatus.OK);
        }
    }
    
}
