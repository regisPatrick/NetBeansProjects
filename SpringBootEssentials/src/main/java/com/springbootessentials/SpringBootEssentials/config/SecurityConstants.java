/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.config;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */
public class SecurityConstants {
    // Authorization Bearer dgjhdgjhdg3aj3fd
    static final String SECRET = "SpringBootEssentials";
    static final String TOKEN_PREFIX = "Bearer ";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/users/sign-up";
    static final long EXPIRATION_TIME = 86400000L;
    
//    public static void main(String[] args) {    
//        System.out.println(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
//    }
    
}
