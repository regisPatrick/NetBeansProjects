/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.dao;

import br.com.regisprojects.modelo.Estado;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class EstadoDAONovo<TIPO> extends DAOGenerico<Estado> implements Serializable{

    public EstadoDAONovo() {
        super();
        classePersistente = Estado.class;
    }
    
}
