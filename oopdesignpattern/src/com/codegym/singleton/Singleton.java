package com.codegym.singleton;



public class Singleton {
	public static void main(String[] args) {
		StaticBlockSingleton instanceOne = StaticBlockSingleton.getInstance();
		System.out.print("Object singleton 1th: " + instanceOne);
		
		 
		StaticBlockSingleton instanceTwo = StaticBlockSingleton.getInstance();
		System.out.print("\nObject singleton 2th: " + instanceTwo);
		
		//StaticBlockSingleton instanceThree = new StaticBlockSingleton();
		
	}
}
