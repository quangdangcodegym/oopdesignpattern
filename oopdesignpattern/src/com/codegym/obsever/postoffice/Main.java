package com.codegym.obsever.postoffice;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        Observer observer = new MailBox();
        postOffice.addObserver(observer);


        Observer observer2 = new MailBox2();
        postOffice.addObserver(observer2);


        postOffice.newMail();
        postOffice.notifyObserver();
    }
}
