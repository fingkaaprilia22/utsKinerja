package com.company;


public class Titan extends Character {

    Titan(int h, int a, int d) {
        super(h, a, d);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 4.0)
            return true;
        else
            return false;
    }
}

