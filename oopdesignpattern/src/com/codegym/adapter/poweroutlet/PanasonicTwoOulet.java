package com.codegym.adapter.poweroutlet;

/**
 * Panasonic là loại ổ cắm điện 2 chấu
 */
public class PanasonicTwoOulet implements ITwoOulet{
    @Override
    public void useTwoOuletPower() {
        System.out.println("You are using PanasonicTwoOulet...");
    }
}
