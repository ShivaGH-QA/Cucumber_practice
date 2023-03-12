package com.java.practice;

import java.util.Random;
// variables and methods can be called using the extends and static
// if we use static we can use direclty with class name no need to create object
// extends will give objects of parent class static variables also can be seen here
public class CallingVariable extends ForLoopExamples{
	
	static Random rnd=new Random();
	static ForLoopExamples fl=new ForLoopExamples();
	public static String num=String.format("%04d", rnd.nextInt(10000));
	public static String name2=num+name;
	public static String name3=num+fl.name;
	
public static void main(String[] args) {
	int d=3;
	ForLoopExamples fle=new ForLoopExamples();
	//System.out.println("str value is "+name2);
	//System.out.println("str object sting value is "+name3);
	//System.out.println(fle.stringProg());
	int c=fle.multiplication(d);
	System.out.println("adding values "+c);
}
}
