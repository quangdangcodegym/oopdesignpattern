package com.codegym.builder.director;

import com.codegym.builder.concretebuilder.FastFoodOrderBuilder;
import com.codegym.builder.product.order.Order;
import com.codegym.builder.product.type.BreadType;
import com.codegym.builder.product.type.OrderType;
import com.codegym.builder.product.type.SauceType;

public class Client {
	 
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}