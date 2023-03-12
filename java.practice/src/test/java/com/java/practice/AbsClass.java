package com.java.practice;

public abstract class AbsClass implements InterfaceI{
	
	// abstract class can have implemented or non implemented methods.
	// abstract class can achive 0-100% abstraction
	// we cant create object to abstract class
	// if a method in a class is abstract method then the class will become abstract bydefault.
	// abstract class can be extended by other class
	
	
	public static void main (String[] args) {
		
	}

	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

	public int mul(int a, int b) {
		int c=a+b;
		return c;
	}
	
	abstract void div(int a, int b);
	

}
