package com.java.practice;

public class AbsClass2 extends AbsClass{

	
	void div(int a, int b) {
		int c=a/b;
		System.out.println("value of c "+c);
	}
	
	public static void main(String[] args) {
		AbsClass2 a2=new AbsClass2();
		a2.div(3, 6);
	}

}
