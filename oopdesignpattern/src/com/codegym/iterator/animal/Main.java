package com.codegym.iterator.animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Get animals through iterator");

        IContainer iContainer = new AnimalContainer();
        IIterator iterator = iContainer.createIterator();

        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

        System.out.println("Get flowers through iterator");
        IContainer iContainer2 = new FlowerContainer();
        IIterator iterator2 = iContainer2.createIterator();

        while (iterator2.hasNext()) {
            Object object = iterator2.next();
            System.out.println(object);
        }
    }
}
