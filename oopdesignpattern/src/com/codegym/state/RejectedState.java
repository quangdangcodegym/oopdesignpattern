package com.codegym.state;

public class RejectedState implements State {
	 
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}