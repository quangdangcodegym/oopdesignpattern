package com.codegym.obsever.postoffice1;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements IOffice{
    List<Observer> listMailPeoples;

    public String address;
    PostOffice() {
        listMailPeoples = new ArrayList<>();
    }
    @Override
    public void addMailPeople(Observer observer) {
        listMailPeoples.add(observer);
    }
    @Override
    public void removeMailPeople(Observer observer) {
        listMailPeoples.remove(observer);
    }
    @Override
    public void notifyMailPeople(String address) {
        for (Observer observer : listMailPeoples) {
            observer.updateMail(address);
        }
    }

    public void newMail(String address) {
        this.address = address;
        notifyMailPeople(address);
    }

}
