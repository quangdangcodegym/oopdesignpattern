package com.codegym.obsever.postoffice1;

public class People2 implements Observer{

    IOffice iOffice;
    People2(IOffice iOffice) {
        this.iOffice = iOffice;

        this.iOffice.addMailPeople(this);
    }
    @Override
    public void updateMail(String address) {
        System.out.println("People2 received mail:  " + address);
    }
}
