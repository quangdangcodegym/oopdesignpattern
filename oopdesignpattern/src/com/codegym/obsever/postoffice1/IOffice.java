package com.codegym.obsever.postoffice1;

public interface IOffice {
    void addMailPeople(Observer observer);
    void removeMailPeople(Observer observer);
    void notifyMailPeople(String address);
}
