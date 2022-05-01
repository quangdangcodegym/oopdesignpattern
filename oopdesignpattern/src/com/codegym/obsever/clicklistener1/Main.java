package com.codegym.obsever.clicklistener1;

public class Main {


    public static void main(String[] args) {
        IQButton iqButton = new QButton();

        ButtonActionListenner buttonActionListenner = new ButtonActionListenner(iqButton);
        iqButton.notifyActionListenners();
    }
}
