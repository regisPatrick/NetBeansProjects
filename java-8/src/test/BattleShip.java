/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author user
 */
public class BattleShip<E> {

    public <T extends E> void fire(T t) {
        if (t.getClass() == Missile.class) {
            System.out.println("Launch");
        } else if (t.getClass() == Shell.class) {
            System.out.println("Fire");
        }
    }

    public static void main(String[] args) {
        BattleShip battleShip = new BattleShip();
        battleShip.fire(new Projectile());
        battleShip.fire(new Missile());
        battleShip.fire(new Shell());
    }
}