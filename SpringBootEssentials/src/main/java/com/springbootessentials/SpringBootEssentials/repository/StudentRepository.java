/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.repository;

import com.springbootessentials.SpringBootEssentials.model.Student;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author user
 */
public interface StudentRepository extends PagingAndSortingRepository<Student, Long>{

    List<Student> findByNameIgnoreCaseContaining(String name);
    
    Student findById(long id);
    
}
