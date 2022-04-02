package com.company;

import com.company.classes.Dragon;
import com.company.classes.Hero;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon(2000,120,150,0);
        Hero hero = new Hero(1000,100,120,250,150);

        int turn = 1;

        //--------------------------level 1 ----------------------------------------

        boolean heroAttack = (Math.random() < 0.7);

        if (heroAttack) {
            int damage = hero.getStrength() + hero.getWeapon() - dragon.getDefence();
            dragon.setHealthPoint(dragon.getHealthPoint() - damage);
            if (dragon.isAlive()) {
                System.out.println("Hero attacked Dragon and cause " + damage + " damage." +
                        "Dragon has left " + dragon.getHealthPoint() + " health points");
            } else {
                System.out.println(("Hero attacked and won!"));
                return;
            }
        } else {
            System.out.println("Hero missed attack");
            return;
        }

        //----------------------level 2 ----------------------------------------------

        boolean DragonsTurn = (Math.random() <= 0.5);
        if(DragonsTurn){
            int damage = dragon.getStrength()+ dragon.getWeapon()- hero.getDefence();
            hero.setHealthPoint(hero.getHealthPoint()-damage);
            if (hero.isAlive()) {
                System.out.println("Dragon attacked Hero and cause " + damage + " damage." +
                        "Hero has left " + hero.getHealthPoint() + " health points");
            } else {
                System.out.println(("Dragon attacked and won!"));
                return;
            }
        }else{
            System.out.println("Dragon did not attack");
        }













    }
}
