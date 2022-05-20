package com.codegym.template.sort;

import java.util.Comparator;

public class ComparatorArea implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        // Theo kieu dien tich
        if ( ((Rectangle)o1).getArea()> ((Rectangle)o2).getArea()) return 1;
        else if (((Rectangle)o1).getArea() < ((Rectangle)o2).getArea()) return -1;
        else return 0;
    }
}
