/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author user
 */
public class ComputerFacade {

    private Memoria memoria;
    
    private HD hd;
    
    private CPU cpu;
    
    private Acessorios acessorios;
    
    private SO so;

    public ComputerFacade() {
        this.memoria = new Memoria();
        this.hd = new HD();
        this.cpu = new CPU();
        this.acessorios = new Acessorios();
        this.so = new SO();
    }
    
    public void montarPC(){
        
        System.out.println("Montando uma nova maquina\n");
        
        memoria.adicionarMemoria();
        hd.adicionarHD();
        cpu.adicionarProcessador();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();
        acessorios.adicionarMonitor();
        so.instalarSO();
        
        System.out.println("\nComputador fabricado");
        
    }
    
}
