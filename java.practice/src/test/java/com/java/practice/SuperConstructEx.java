package com.java.practice;
//for constructors default constructor will be executed while calling the object.
//when calss is extended both parent/base and chils/subclass is executed
//when an arguemented 
public class SuperConstructEx extends superExampes{
	
	public SuperConstructEx() {
		System.out.println("child class def const");
	}
	
	public SuperConstructEx(String name) {
		super(name); // this will call the parent class constructor with arguments
		// if arguemnts is not passed then also default constrctor is called
		//super in constructor should be in 1st step else it will give error
		System.out.println("child class argumented const "+name);	
	}
	
public static void main(String[] args) {
	//SuperConstructEx sce=new SuperConstructEx(); // parent and child default const is called
	SuperConstructEx sce1=new SuperConstructEx("Shiva"); // parent defalt and child argumened const is called
	//SuperConstructEx sce2=new SuperConstructEx("Shiva"); // 
	
}
}
