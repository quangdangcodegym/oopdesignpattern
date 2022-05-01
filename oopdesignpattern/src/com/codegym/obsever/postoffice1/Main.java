package com.codegym.obsever.postoffice1;

public class Main {
    public static void main(String[] args) {
        IOffice iOffice = new PostOffice();

        Observer observer = new People1(iOffice);
        Observer observer2 = new People2(iOffice);



        ((PostOffice)iOffice).newMail("25 Nguyen Tri Phuong");

        ((PostOffice)iOffice).removeMailPeople(observer);

        ((PostOffice)iOffice).newMail("24 Nguyen Tri Phuong");
    }
}
