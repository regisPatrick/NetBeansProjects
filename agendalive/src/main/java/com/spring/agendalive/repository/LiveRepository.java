/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.agendalive.repository;

import com.spring.agendalive.document.LiveDocument;
import java.time.LocalDateTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author user
 */
public interface LiveRepository extends MongoRepository<LiveDocument, String> {
    
    Page<LiveDocument> findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime date, Pageable pageable);
    Page<LiveDocument> findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime date, Pageable pageable);
    
}
