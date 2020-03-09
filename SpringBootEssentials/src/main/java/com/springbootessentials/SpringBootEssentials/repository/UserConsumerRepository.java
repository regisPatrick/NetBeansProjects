/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.repository;

import com.springbootessentials.SpringBootEssentials.model.UserConsumer;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author user
 */
public interface UserConsumerRepository extends PagingAndSortingRepository<UserConsumer, Long>{
    
    UserConsumer findByUserName(String UserName);
    
}
