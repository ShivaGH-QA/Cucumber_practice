package com.java.practice;
//the process of binding the data is caled encapulation
	// example is java class which will contain variables, methods, constructors, instance block static block
	// variables inside encaspulation is PRIVATE
	// we use getter and setters to set a value and get a value
	// 
	
public class Encapsulation_getter_Setter {
	
	private String name;
	private int number;
	
	// setter method 
	public void setName(String name) { // this is a local variable
		this.name=name; // converting local variable to instance variable
	}
	
public void setumber(int number) {
		 this.number=number;
	}

public String getName() {
	//name="shova";
	//System.out.println(name);
	return name;
}

public int getNumber() {
	//number=10;
	//System.out.println(number);
	return number;
}

public static void main(String[] args) {
	Encapsulation_getter_Setter egs=new Encapsulation_getter_Setter();
	egs.setName("BBellary");
	egs.setumber(10);
	String na=egs.getName();
	System.out.println("name vlue "+na);
	int val=egs.getNumber();
	System.out.println("value is "+val);
	//OR
	System.out.println();
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	
	
	
}

}
