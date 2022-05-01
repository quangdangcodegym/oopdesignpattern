package com.codegym.obsever.postoffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject{
    public String address;
    List<Observer> listObservers;

    PostOffice() {
        listObservers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }
    @Override
    public void notifyObserver() {
        for (Observer observer : listObservers) {
            //observer.update();
            observer.update(address);
        }
    }
    public void newMail() {
        address = "from: 24 Nguyen Tri Phuong";
    }
}
