package com.java.practice;
//super is applicable for variable, method and constructor
//super is called from the method but can't call from public static main method.
//super is 
//This is one of the reserved keyword in Java, super keyword is the reference variable.
//super keyword can be used with variables,methods and constructor.
//super keyword will be used when we use inheritance concept.

public class superExampes extends StringClassExamples{
	
	public superExampes() {
		System.out.println("this is base super const examples");
	}
	
	public superExampes(String name) {
		System.out.println("this is base super const examples with args"+name);
	}
	
	public int add(int a, int b) {
		int c= a+b;
		c=c+10;
		//System.out.println("this is super exmples "+c);
		return c;
		}
	
	public String strArry() {
		System.out.println("thi is overridden method");
		return name; // this is printing from parent class
	}
	
	
	public void strSuperExp() {
		String c=super.strArry();
		System.out.println("executing the base and child " + c);
		String d=strArry();
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		superExampes se=new superExampes();
		se.strSuperExp();
		//System.out.println("value of "+c);	
	}
}
