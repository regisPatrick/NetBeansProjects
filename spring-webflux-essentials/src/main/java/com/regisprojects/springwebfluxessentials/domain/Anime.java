/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("anime")
public class Anime {
    
    @Id
    private Integer id;
    @NotNull
    @NotEmpty(message = "The name of this anime cannot be empty")
    private String name;
    
}
