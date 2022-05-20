package com.codegym.obsever.buttonclick;

public class ActionListenerQImpl implements ActionListenerQ{
    @Override
    public void actionPerformed(String message) {
        System.out.println("Da nhan duoc: " + message);
    }
}
