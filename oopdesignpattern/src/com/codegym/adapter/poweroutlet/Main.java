package com.codegym.adapter.poweroutlet;

public class Main {
    public static void main(String[] args) {
        IJackPower iJackPower = new PowerAdapter();
        iJackPower.useThreeJackPower();
    }
}
