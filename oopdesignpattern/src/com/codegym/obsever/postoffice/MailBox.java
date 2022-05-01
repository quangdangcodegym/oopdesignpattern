package com.codegym.obsever.postoffice;

public class MailBox implements Observer{
    @Override
    public void update(String address) {
        System.out.println("MailBox received mail: " + address);
    }
    /*@Override
    public void update() {
        System.out.println("MailBox received mail");
    }*/


}
