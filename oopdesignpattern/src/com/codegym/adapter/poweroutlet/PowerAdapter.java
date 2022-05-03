package com.codegym.adapter.poweroutlet;

public class PowerAdapter implements IJackPower{

    ITwoOulet iTwoOulet;
    PowerAdapter() {
        iTwoOulet = new PanasonicTwoOulet();
    }
    @Override
    public void useThreeJackPower() {
        System.out.println("PowerAdapter are using three jack power");
        iTwoOulet.useTwoOuletPower();

    }
}


