package com.java.practice;

public class InterfaceI1 implements InterfaceI{
	
	
	public static void main (String[] args) {
		InterfaceI1 I1=new InterfaceI1(); // valid both child and base methods are shown 
		I1.add(5, 10);
		I1.meth1();
		I1.mul(5, 10);
		
		InterfaceI1 I2=new InterfaceI1(); // valid only base methods and variables are shown here
		I2.add(4, 40);
		I2.mul(3, 30);
		
		
		//InterfaceI I3=new InterfaceI(); // invalid becasuse ew cant crate object for interfaces(i.e unimplemented methods)
		//InterfaceI1 I4=new InterfaceI(); // invalid becasuse ew cant crate object for interfaces(i.e unimplemented methods)
	}

	public void meth1() {
		System.out.println("this is methid 1");
	}
	
	
	public int add(int a, int b) {
		int c=a+b;
		return c;
		
	}

	
	public int mul(int a, int b) {
		
		int c=a+b;
		return c;
	}
	

}
