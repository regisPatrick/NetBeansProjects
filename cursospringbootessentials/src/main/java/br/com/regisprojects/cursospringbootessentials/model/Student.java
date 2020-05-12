/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.model;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

/**
 *
 * @author user
 */
public class Student {
    
    private int id;
    
    private String name;
    
    public static List<Student> studentList;
    
    static{
        studentRepository();
    }

    public Student(int id, String name) {
        this(name);
        this.id = id;
    }
    
    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
    
    private static void studentRepository(){
        studentList = new ArrayList<>(asList(new Student(1, "Deku"), new Student(2, "Todoroki")));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
