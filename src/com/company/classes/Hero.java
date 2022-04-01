package com.company.classes;

public class Hero {
    private int healthPoint;
    private int defence;
    private int strength;
    private int weapon;
    private int shield;

    public Hero(int healthPoint, int defence, int strength, int weapon, int shield) {
        this.healthPoint = healthPoint;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public boolean isAlive(){
        return (getHealthPoint()>0);
    }
}
