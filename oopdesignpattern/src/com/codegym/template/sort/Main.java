package com.codegym.template.sort;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyList<Shape> shapes = new MyList<>(5);
        shapes.add(new Rectangle(5, 6));
        shapes.add(new Rectangle());
        shapes.add(new Rectangle(5, 8));
        shapes.add(new Rectangle(1, 6));
        shapes.add(new Rectangle(1, 1));

        shapes.printMyList();
        shapes.sortComparable();


        /*Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Rectangle r1 = (Rectangle) o1;
                Rectangle r2 = (Rectangle) o2;
                if (r1.getPerimeter() > r2.getPerimeter()) return 1;
                else if (r1.getPerimeter() < r2.getPerimeter()) return -1;
                else return 0;
            }
        };
        shapes.sortComparator(comparator);*/
        shapes.printMyList();
    }
}
