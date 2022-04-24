package com.codegym.builder.builder;

import com.codegym.builder.product.order.Order;
import com.codegym.builder.product.type.BreadType;
import com.codegym.builder.product.type.OrderType;
import com.codegym.builder.product.type.SauceType;
import com.codegym.builder.product.type.VegetableType;

public interface OrderBuilder {
	 
    OrderBuilder orderType(OrderType orderType);
 
    OrderBuilder orderBread(BreadType breadType);
 
    OrderBuilder orderSauce(SauceType sauceType);
 
    OrderBuilder orderVegetable(VegetableType vegetableType);
 
    Order build();
 
}