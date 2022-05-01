package com.codegym.obsever.postoffice;

public class MailBox2 implements Observer{
    @Override
    public void update(String address) {
        System.out.println("MailBox2 received mail: " + address);
    }
}
