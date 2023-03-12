package com.java.practice;
//here insted of passing the parameters inn method
//passing the values in constructor only . constructor is to initialize variables
//below examples for constructior intAdd and doubleAdd
// also, below i ve mentioned abt ethe constructor over loading aswell
// Constructor name is same as class name
// constructior will not have retrn type we can give but i dnt see its working so return type
// constructor can accept methods arguemts
// constructor constructor uses public and private not static final abstract and sysnchornized
// constructor loads when the object is created we ned not to call specifically
public class ContructClass {
	int x,y,w;
	double u,v;
	public static void main(String[] args) {	
		ContructClass CC=new ContructClass(9,5);
		System.out.println("x val "+CC.x);
		System.out.println("y val "+CC.y);
		CC.intAdd();
		ContructClass CC2=new ContructClass(14.5,12.5);
		CC2.doubleAdd();
		ContructClass CC3=new ContructClass(8,6,4); // constructor overloading
		CC3.intAdd2();
	}
	
	  public ContructClass(int a, int b) 
	  { 
		  this.x=a;
		  this.y=b; 
		  
	  }
	  
	  public ContructClass(int a, int b,int d) 
	  { 
		  this.x=a;
		  this.y=b;  
		  this.w=d;
	  }
	  
	  public ContructClass(double a, double b) 
	  { 
		  this.u=a;
		  this.v=b;  
	  }
	  
		  public void intAdd() { 
			  int c=x+y; 
			  System.out.println("addition of int "+c);
			  }
		  public void intAdd2() { 
			  int c=x+y+w; 
			  System.out.println("addition of int "+c);
			  }
		  public void doubleAdd() { 
			  double c=u+v; 
			  System.out.println("addition of double "+c);
			  }
}
