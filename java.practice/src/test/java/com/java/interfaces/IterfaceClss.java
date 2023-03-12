package com.java.interfaces;

public class IterfaceClss implements InterfaceI,InterfaceNew{

		
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
		IterfaceClss ic=new IterfaceClss();
		ic.add(3,5);
		ic.mul(3, 4);
		ic.sin();
		ic.cos();
		
		
	}
	
	public void concat() {
		// TODO Auto-generated method stub
		
	}

	public void trim() {
		// TODO Auto-generated method stub
		
	}

}
