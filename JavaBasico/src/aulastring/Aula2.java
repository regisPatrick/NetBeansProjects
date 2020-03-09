/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulastring;

/**
 *
 * @author user
 */
public class Aula2 {
    
    public static void main(String[] args) {
        
        String curso = "Curso ";
        String java = "Java";
        
        String cursoJava = curso + java;
        
        System.out.println(cursoJava);
        
        String resultado2Com2 = "Resultado de 2 + 2 = " + (2 + 2);
        System.out.println(resultado2Com2);
        
        String resultado2Com2_ = "Resultado de 2 + 2 = " + 2 + 2;
        System.out.println(resultado2Com2_);
        
        String um = String.valueOf(1);
        System.out.println(um);
        
        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod "
                + "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis "
                + "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis "
                + "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla"
                + " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia "
                + "deserunt mollit anim id est laborum.";
        
        System.out.println(concatenacao);
        
        String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ";
        concatenacao2 += "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis ";
        concatenacao2 += "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis ";
        concatenacao2 += "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla";
        concatenacao2 += " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia ";
        concatenacao2 += "deserunt mollit anim id est laborum.";
        
        System.err.println(concatenacao2);
        
    }
    
}
