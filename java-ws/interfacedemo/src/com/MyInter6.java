package com;

@FunctionalInterface
public interface MyInter6 {

	int f7(int x,int y);
	
	default void info() {
		System.out.println(">>> MyInter6 information"); // can not changed..
	}
	
	default void info1() {
		System.out.println(">>> MyInter6 information -  1");
	}
	
	// static method
	
	 static void info3() {
		 System.out.println(">>> info3");
	 }
	 static void info4() {
		 
	 }

}
