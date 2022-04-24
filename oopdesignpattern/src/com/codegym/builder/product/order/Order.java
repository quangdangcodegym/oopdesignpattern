package com.codegym.builder.product.order;

import com.codegym.builder.product.type.BreadType;
import com.codegym.builder.product.type.OrderType;
import com.codegym.builder.product.type.SauceType;
import com.codegym.builder.product.type.VegetableType;

public class Order {
	 
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
 
    public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        super();
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }
 
    @Override
    public String toString() {
        return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
                + ", vegetableType=" + vegetableType + "]";
    }
 
    public OrderType getOrderType() {
        return orderType;
    }
 
    public BreadType getBreadType() {
        return breadType;
    }
 
    public SauceType getSauceType() {
        return sauceType;
    }
 
    public VegetableType getVegetableType() {
        return vegetableType;
    }
 
}
 

 


 
