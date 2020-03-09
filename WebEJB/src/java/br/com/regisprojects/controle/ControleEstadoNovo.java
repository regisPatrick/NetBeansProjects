/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.controle;

import br.com.regisprojects.dao.EstadoDAONovo;
import br.com.regisprojects.modelo.Estado;
import br.com.regisprojects.util.Util;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author user
 */
@Named(value = "controleEstadoNovo")
@ViewScoped
public class ControleEstadoNovo implements Serializable{
    
    @EJB
    private EstadoDAONovo<Estado> dao;
    private Estado objeto;
    private Boolean editando;

    public ControleEstadoNovo(){
        editando = false;
    }
    
    public String listar(){
        return "/privado/estado/listar?faces-redirect=true";
    }
    
    public void novo(){
        objeto = new Estado();
        editando = true;
    }
    
    public void alterar(Integer id){
        try{
            objeto = dao.getObjectById(id);
            editando = true;
        } catch (Exception e) {
            Util.mensagemErro("Erro ao recuperar o objeto: " + Util.getMensagemErro(e));
        }
    }
    
    public void remover(Integer id){
        try{
            objeto = dao.getObjectById(id);
            dao.remover(objeto);
        } catch (Exception e) {
            Util.mensagemErro("Erro ao remover o objeto: " + Util.getMensagemErro(e));
        }
    }
    
    public void salvar(){
        try{
            if(objeto.getId() == null){
                dao.persist(objeto);
            } else {
                dao.merge(objeto);
            }
            editando = false;
        } catch (Exception e) {
            Util.mensagemErro("Erro ao persistir objeto: " + Util.getMensagemErro(e));
        }
    }
    
    public EstadoDAONovo<Estado> getDao() {
        return dao;
    }

    public void setDao(EstadoDAONovo<Estado> dao) {
        this.dao = dao;
    }

    public Estado getObjeto() {
        return objeto;
    }

    public void setObjeto(Estado objeto) {
        this.objeto = objeto;
    }

    public Boolean getEditando() {
        return editando;
    }

    public void setEditando(Boolean editando) {
        this.editando = editando;
    }
    
}
