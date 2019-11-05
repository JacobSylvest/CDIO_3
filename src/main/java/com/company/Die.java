package com.company;

public class Die {

    private int roll;

    public Die(){
    }
    public void roll() {
        roll = (int) (Math.random()* 6)+1;
    }
    public int getDots() {
        return roll;
    }
}