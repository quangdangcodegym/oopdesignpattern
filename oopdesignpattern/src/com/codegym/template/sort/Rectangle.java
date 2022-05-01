package com.codegym.template.sort;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparable<Rectangle> {
    private int width;
    private int height;
    public Rectangle() {

    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return this.height*this.width;
    }
    public int getPerimeter() {
        return this.height+this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + width*height +
                ", perimeter=" + width+height +
                '}';
    }



    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()) return 1;
        else if (this.getArea() < o.getArea()) return -1;
        else return 0;
    }
}
