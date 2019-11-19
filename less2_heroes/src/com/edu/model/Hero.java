package com.edu.model;


public class Hero {
    private byte health;
    private byte intellect;
    private byte strength;
    private Item[] items;

    public Hero(byte health, byte intellect, byte strength) {
        this.health = health;
        this.intellect = intellect;
        this.strength = strength;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    Hero(){

    }


}