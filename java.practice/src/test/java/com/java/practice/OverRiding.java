package com.java.practice;

public class OverRiding extends OverLoading{
	//over riding also extends the parent class(i.e  inheritance) but in over riding 
// we make chages in method as per the requirent. And based on the parent and child class object
	// reference the respective metod is called. Examples below.
	// for ovder riding methods an arrow mark will be shown for ex @ method public int add(int a, int b).
	//for over riding the method name and signature must be same 
	//if it is final method then overriding is not allowed. having one method as final in a class will not allow the 
	//overriding
	public int add(int a, int b) {
		System.out.println("Over riding in child class ");
		int c= a+b;
		System.out.println("Over riding in child class "+c);
		if (c>0) {
			System.out.println("addition is success");
		}
		return c;
		}
	
	public void mul() {
		System.out.println("child class mul");
	}
	
	public static void main(String[] args) {
		
		OverRiding ol=new OverRiding();// point obj and ref to child class and both parent&child wil be executed
		System.out.println(ol.add(5, 10));
		ol.mul(); // from child class
		ol.div(); // from parent class
		ol.add(4, 5);// over ridden from parent class
		OverLoading ol1=new OverLoading();//point and ref to parent clas only an parent class will be executed.
		int num=ol1.add(3, 4); // over ridden from parent class
		System.out.println("num fom parent add method "+num);
		ol1.div(); // from parent class
		
		OverLoading ol2=new OverRiding(); //parent can hold child but the child class prog will be executed
		ol2.add(4, 5); //over ridden  from parent class
		ol2.div(); // from parent class
		
		//OverRiding ol3=new OverLoading(); // this is not possible this will give error as the child ref cant hold parent ref.
		
	}

}
