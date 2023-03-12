package com.java.practice;

public class Inheritance extends OverLoading{
	// in inhertence when we extend the parent class(i.e base) all the methods and variables can be pulled 
	// from parent class. and same can be pulled using the object ref.
	// we also can write methods in child class.
	//object can be created for both child and parent classes.
	// child calss obj(Inheritance) will have both parent and child class methods sice it is extending parent example below
	// parent class obj will have only parent class methods not child class methods
	// here we are only calling objects and using them unlike Over riding. we are not mking any changes to methods.
int c;
	public void mul(int a, int b) {
		c=a*b;
		System.out.println("c val is "+c);
	}
	public static void main(String[] args) {
		Inheritance in =new Inheritance(); // as this is extended it will show all the methods from parent and child class
		in.add(3, 4);
		in.mul(3, 4);
		in.div();
		OverLoading ol=new OverLoading(); // this will show only parent class method (add, div) and child class method mul is not shown here
		ol.add(5, 10);
		
		OverLoading ol2= new Inheritance(); //this will show only parent class method (add, div) and child class method mul is not shown here
		ol2.add(4, 5);
		ol2.div();
		//ol2.mul(2,3); // this will give error
		
		//Inheritance in3=new OverLoading(); // this will give error as the child cant hold parent 
		
		
		
	}
}
