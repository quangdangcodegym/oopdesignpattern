package com.codegym.obsever.postoffice1;

public class People1 implements Observer{
    IOffice iOffice;
    People1(IOffice iOffice) {
        this.iOffice = iOffice;

        this.iOffice.addMailPeople(this);
    }
    @Override
    public void updateMail(String address) {
        System.out.println("People1 received mail:  " + address);
    }
}
