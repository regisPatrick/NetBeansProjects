/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.repository;

import br.com.regisprojects.cursospringbootessentials.model.Student;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface StudentRepository extends CrudRepository<Student, Long>{
    
    List<Student> findByNameIgnoreCaseContaining(String name);
    
}
