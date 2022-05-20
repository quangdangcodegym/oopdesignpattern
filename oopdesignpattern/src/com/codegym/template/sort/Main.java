package com.codegym.template.sort;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyList<Shape> shapes = new MyList<>(5);
        shapes.add(new Rectangle(5, 6));
        shapes.add(new Rectangle());
        shapes.add(new Rectangle(5, 8));
        shapes.add(new Rectangle(1, 6));
        shapes.add(new Rectangle(1, 1));
        System.out.println("Using my Iterator");

        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {


                if ( ((Rectangle)o1).getPerimeter()> ((Rectangle)o2).getPerimeter()) return 1;
                else if (((Rectangle)o1).getPerimeter() < ((Rectangle)o2).getPerimeter()) return -1;
                else return 0;
            }
        };

        Comparator<Object> comparatorArea = new ComparatorArea();
        shapes.printMyList();
        shapes.sortComparator(comparatorArea);
        shapes.printMyList();



        List<Date> list = new ArrayList<>();


        /*Iterator<Shape> iterator = shapes.createIterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            System.out.println("Iterator element: " + shape);
        }*/

        /*shapes.printMyList();
        shapes.sortComparable();*/




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
        //shapes.printMyList();
    }
}
