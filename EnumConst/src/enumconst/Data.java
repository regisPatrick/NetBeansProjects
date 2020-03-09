/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumconst;

/**
 *
 * @author user
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    private DiaSemanaEnum diaSemanaEnum;

    public Data() {
        super();
    }
    
    public Data(int dia, int mes, int ano, DiaSemanaEnum diaSemanaEnum) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemanaEnum = diaSemanaEnum;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemanaEnum getDiaSemanaEnum() {
        return diaSemanaEnum;
    }

    public void setDiaSemanaEnum(DiaSemanaEnum diaSemanaEnum) {
        this.diaSemanaEnum = diaSemanaEnum;
    }
    
}
