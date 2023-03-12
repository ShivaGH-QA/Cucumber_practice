package com.java.practice;

public class finalDemo {
	// final is applicable for variable, method and class.
	// by default variables in interface is static final
	//once the varibale is declared as final user can not override it.
	// if a method declared as final it can not be over ridden but we can inherit it just for using purpose.
	// if a class is final then we can't inherit it 
	//final variable always uses CAPITAL letter 
	//final varibale should be initialized else we get error to initialize
	// blank variable can be initialized only in constructor
	//final varibale are conisdered as CONSTANT variables
	
	public final String name="name final string";
	//public String name=name.concat("test"); // final varibale cant be overridden
	public final String name2;
	public finalDemo(String name2) {
		this.name2 = name2;
		System.out.println("final val from const "+name2);
	}
	
public static void main(String[] args) {
	finalDemo fd=new finalDemo("test");
	System.out.println("this is final class " +fd.name);
	char[] s=fd.strArry();
	System.out.println(s);
}

public final char[] strArry() { // this avoids changes in method implementation
	char[] namez=name.toCharArray();
	return namez;
}
}
