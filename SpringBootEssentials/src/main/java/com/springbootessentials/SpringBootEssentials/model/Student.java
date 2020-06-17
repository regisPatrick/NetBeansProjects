/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.model;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author user
 */
@Entity
public class Student extends AbstractEntity{
    
//    private int id;
//    
//    private String name;
//    
//    public static List<Student> studentList;
//    
//    static{
//        studentRepository();
//    }
//    
//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Student(String name) {
//        this.name = name;
//    }
//    
//    public Student() {
//    }
//    
//    private static void studentRepository(){
//        studentList = new ArrayList<>(asList(new Student(1, "Deku"), new Student(2, "Todoroki")));
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public static List<Student> getStudentList() {
//        return studentList;
//    }
//
//    public static void setStudentList(List<Student> studentList) {
//        Student.studentList = studentList;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 11 * hash + this.id;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Student other = (Student) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        return true;
//    }
    
    @NotEmpty(message = "O campo nome do estudante é obrigatório")
    private String name;
    
    @NotEmpty(message = "O campo email do estudante é obrigatório")
    @Email
    private String email;

    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public Student(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + '}';
    }
    
}
