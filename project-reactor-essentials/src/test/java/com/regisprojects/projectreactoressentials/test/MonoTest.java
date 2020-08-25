/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.projectreactoressentials.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 *
 * @author user
 */
@Slf4j
public class MonoTest {
    
//    @Test
//    public void test(){
//        log.info("Everything working as intendend");
//    }
    
    @Test
    public void monoSubscriber(){
        String name = "regis";
        Mono<String> mono = Mono.just(name)
                .log();
        
        mono.subscribe();
        log.info("---------------------------------------");
        StepVerifier.create(mono)
                .expectNext(name)
                .verifyComplete();
//        log.info("Mono {}", mono);
//        log.info("Everything working as intendend");
    }
    
}
