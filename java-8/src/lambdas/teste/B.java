/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.teste;

/**
 *
 * @author user
 */
public class B {
   

    public static void main(String[] args) {
        String s1 = "Test1";
        String s2 = "Test1";
        String s3 = new String("Test1");
        String s4 = String.valueOf("Test1");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s4);
    }
}
    

