package com.codegym.iterator.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalContainer implements IContainer{


    private String[] animals = {"dog", "cat", "monkey", "lion"};
    @Override
    public IIterator createIterator() {

        AnimalIterator result = new AnimalIterator();
        return result;
    }

    private class AnimalIterator implements IIterator{

        private int position;
        @Override
        public boolean hasNext() {
            if (position < animals.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return animals[position++];
            }
            return null;
        }
    }
}
