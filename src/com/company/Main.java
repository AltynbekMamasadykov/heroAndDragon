package com.company;

import com.company.classes.Dragon;
import com.company.classes.Hero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon(2000,120,150,0);
        Hero hero = new Hero(100,100,120,250,150);

        int turn = 1;

        while(hero.isAlive()|| dragon.isAlive()){

            System.out.println("Turn "+turn);


        //--------------------------level 1 ---------------------------------------
        boolean heroAttack = (Math.random() < 0.7);

        if (heroAttack) {
            int damage1 = hero.getStrength() + hero.getWeapon() - dragon.getDefence();
            dragon.setHealthPoint(dragon.getHealthPoint() - damage1);
            if (dragon.isAlive()) {
                System.out.println("Hero attacked Dragon and cause " + damage1 + " damage." +
                        "Dragon has left " + dragon.getHealthPoint() + " health points");
            } else {
                System.out.println(("Hero attacked and won!"));
                return;
            }
        } else {
            System.out.println("Hero missed attack");

        }

        //----------------------level 2 ----------------------------------------------

        boolean DragonsTurn = (Math.random() <= 0.5);
        if(DragonsTurn){
            int damage2 = dragon.getStrength()+dragon.getWeapon()-hero.getDefence();
            hero.setHealthPoint(hero.getHealthPoint()-damage2);
            if (hero.isAlive()) {
                System.out.println("Dragon attacked Hero and cause " + damage2 + " damage." +
                        "Hero has left " + hero.getHealthPoint() + " health points");
            } else {
                System.out.println(("Dragon attacked and won!"));
                return;
            }
        }else{
            System.out.println("Dragon did not attack");
        }


        //--------------------------level 3 ---------------------------------------------
        System.out.println("What do you want Hero to do? \n 1-Attack  \n 2-Defence \n 3-Nothing");
        Scanner scanner = new Scanner(System.in);
        int whatToDo = scanner.nextInt();
        boolean useShield = false;
        switch (whatToDo){
            case 1:
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

                }break;
            case 2:
                heroAttack = false;
                useShield = true;
                hero.setDefence(hero.getDefence()+ hero.getShield());
                System.out.println("Hero defending");
                break;
            case 3:
                System.out.println("Hero did nothing");
        }


        System.out.println();
        turn++;
        }



    }
}
