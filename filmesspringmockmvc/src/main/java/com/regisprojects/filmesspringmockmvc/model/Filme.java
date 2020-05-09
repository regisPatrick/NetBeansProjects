/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.filmesspringmockmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author user
 */
@Data
@AllArgsConstructor
public class Filme {
    
    private Long Codigo;
    private String titulo;
    private String descricao;
    
}
