/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author user
 */
public class B extends A {
    public String toString() {
        return super.toString() + getClass().getSimpleName();
    }
}