package com.java.practice;

public class finalInherit extends finalDemo{

	public finalInherit(String name2) { // since the constructor is created for initializing the 
		//blank variable , tis is automatically came after extending the class.
		super(name2);
		
	}

	/*
	 * public final char[] strArry() { // this avoids changes in method
	 * implementation char[] namez=name.toCharArray(); return namez; }
	 */
	public static void main(String[] args) {
		finalInherit fi=new finalInherit("shiva test2");
		char[] a=fi.strArry();
		System.out.println(a);
	}
}
