/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.APIRestEvento;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author user
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.regisprojects.APIRestEvento"))
                .paths(regex("/evento.*"))
                .build()
                .apiInfo(metaInfo());
    }
    
    private ApiInfo metaInfo(){
            ApiInfo apiInfo = new ApiInfo(
                "Eventos API REST",
                "API REST de cadastro de eventos",
                "1.0",
                "Terms of Service",
                new Contact("Regis Patrick", "https://www.youtube.com",
                    "regis@email.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
            );
            return apiInfo;
    }
    
}
