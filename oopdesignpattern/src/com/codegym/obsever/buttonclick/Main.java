package com.codegym.obsever.buttonclick;

public class Main {
    public static void main(String[] args) {
        ButtonQ buttonQ = new ButtonQ();

        ActionListenerQImpl actionListenerQImpl = new ActionListenerQImpl();
        buttonQ.addActionListener(actionListenerQImpl);


        buttonQ.addActionListener(new ActionListenerQ() {
            @Override
            public void actionPerformed(String message) {
                System.out.println("Da nhan duoc loai 2: " + message);
            }
        });


        buttonQ.notifyClicked();

    }
}
