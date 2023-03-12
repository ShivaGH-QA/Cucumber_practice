package com.java.practice;

public class OverLoading {

	public int add(int a, int b) {
	int c= a+b;
	return c;
	}
	
	public double add(double a, double b) {
		double c=a+b;
		return c;
	}
	
	public int add(int a, int b, int c) {
		int d= a+b+c;
		return d;
		}
	
	public double add(int a, double b) {
		double c=a+b;
		return c;
	}
	
	public void div() {
		System.out.println("div paent class");
	}
	
	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		System.out.println(ol.add(5,10));
		System.out.println(ol.add(10.5, 15.5));
		System.out.println(ol.add(2,3,5));
		System.out.println(ol.add(2,3.5));
	}
}
