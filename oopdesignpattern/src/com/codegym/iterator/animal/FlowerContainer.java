package com.codegym.iterator.animal;

import java.util.ArrayList;
import java.util.List;

public class FlowerContainer implements IContainer{
    private List<String> flowerList = new ArrayList<>();

    public FlowerContainer() {
        flowerList.add("rose");
        flowerList.add("daffodil");

    }
    @Override
    public IIterator createIterator() {
        FlowerIterator result = new FlowerIterator();
        return result;
    }

    private class FlowerIterator implements IIterator {
        @Override
        public boolean hasNext() {
            if (flowerList.size() > 0) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                String flower = flowerList.get(0);
                flowerList.remove(0);
                return flower;
            } else {
                return null;
            }
        }
    }

}
