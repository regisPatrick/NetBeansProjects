/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.agendalive.service;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.repository.LiveRepository;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class LiveService {
    
    @Autowired
    LiveRepository liveRepository;
    
    public Page<LiveDocument> findAll(Pageable pageable, String flag){
        if(flag != null && flag.equals("next")){
            return liveRepository.findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime.now(), pageable);
        }else if(flag != null && flag.equals("previous")){
            return liveRepository.findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime.now(), pageable);
        }else{
            return liveRepository.findAll(pageable);
        }
    }
    
    public Optional<LiveDocument> findById(String id){
        return liveRepository.findById(id);
    }
    
    public LiveDocument save(LiveDocument liveDocument){
        return liveRepository.save(liveDocument);
    }
    
    public void delete(LiveDocument liveDocument){
        liveRepository.delete(liveDocument);
    }
    
}
