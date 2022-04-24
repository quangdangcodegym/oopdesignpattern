package com.codegym.builder.concretebuilder;

import com.codegym.builder.builder.OrderBuilder;
import com.codegym.builder.product.order.Order;
import com.codegym.builder.product.type.BreadType;
import com.codegym.builder.product.type.OrderType;
import com.codegym.builder.product.type.SauceType;
import com.codegym.builder.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {
	 
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
 
    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }
 
    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }
 
    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }
 
    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }
 
    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
 
}