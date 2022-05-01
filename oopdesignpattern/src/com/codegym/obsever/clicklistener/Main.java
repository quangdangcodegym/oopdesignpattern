package com.codegym.obsever.clicklistener;

public class Main {


    public static void main(String[] args) {
        IQButton iqButton = new QButton();
        iqButton.addActionListenner(new ActionListenner() {
            @Override
            public void actionPerform(ActionEvent event) {
                System.out.println("Button clicked: " + event.name());
            }
        });


        iqButton.notifyActionListenners();
    }
}
