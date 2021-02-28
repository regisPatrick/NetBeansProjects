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
public class A {
    
    private static String name = "test1";
    private static A a = new A();

    static {
        name = "test2";
    }

    public A(){
        name = "test3";
    }

    public static String print(){
        return a.name;
    };

    @Override
    public String toString() {
        return print();
    }

    public static void main(String[] args) {
        System.out.println(A.print());
    }

    
}
