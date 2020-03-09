/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author user
 */
@Entity
public class UserConsumer extends AbstractEntity{
    
    @NotEmpty
    @Column(unique = true)
    private String userName;
    
    @NotEmpty
    @JsonIgnore
    private String password;
    
    @NotEmpty
    private String name;
    
    @NotEmpty
    private Boolean administrator;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(Boolean administrator) {
        this.administrator = administrator;
    }
    
}
