package com.java.interfaces;

public class IterfaceClss2 implements InterfaceI{

		
	public void add(int a, int b) {
		int c= a+b;
		System.out.println("c value is "+c);		
	}

	
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println("mul c valu is "+c);
		
	}

 public void sin() {
	 System.out.println("sin methid");
 }
 public void cos() {
	 System.out.println("cos method");
 }
	public static void main(String[] args) {
		InterfaceI ic=new IterfaceClss2();
		ic.add(3, 4);
		ic.mul(5, 5);
		
	}

}
