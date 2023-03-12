package com.java.practice;

public class AdditionWithConstructor {
	int x;
	int y;
	AdditionWithConstructor(int a, int b){
		this.x=a;
		this.y=b;
		
	}
	//this prog i ve creted to check the constructor but this i did not
	//understand the constructor yet understand this.
	public int add(int x, int y) {
		int c=x+y;
		return c;
	}
	
	public static void main(String[] args) {
		AdditionWithConstructor construct=new AdditionWithConstructor(5,10);
		System.out.println(construct.add(10,15));
		
		
		
	}

}
