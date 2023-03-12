package com.java.practice;


public class ForLoopExamples {
	
	public static String name="Shiva";
		
	//for loop for pritning incremental numbers
public static void forLoop1() {

	for (int i=0;i<10;i++) {
		System.out.println("value of i "+i);
	}	
}

// fmethod to add two numbers
public static int forLoop2(int a, int b) {
	int c=a+b;	
	
	return c;
}

//for loop to print numbers in reverse format
public static void forLoop3() {
	for (int i=10;i>0;i--) {
		System.out.println(i);
	}
}

//swapping the numbers
public static void swapNumbers(int num1,int num2) {
	//int num1=10;
	//int num2=20;
	int temp;
	
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("print num1 "+num1);
	System.out.println("print num1 "+num2);
}

//check even or odd
public static void evenOrOdd(){
	for(int i=1;i<10;i++) {
		if(i%2==0) {
			System.out.println("number is even "+i);
		}else {
			System.out.println("number is odd "+i);
		}
	}
}

// infinite loop
public static void infinteLoop() {
for (int i=5;i<6;i--) {
	System.out.println("infi loop "+i);
}
}

public static void infinteWhileLoop() {
	while(6>5) {
		System.out.println("infi while loop ");	
	}
}

public static void doWhileLoop() {
	int a=0;
	do {
		System.out.println("do while "+a);
		a++;
	}while(a<20);
}

//print a-z alphabets
public static void alphabets() {
	for(char a='a';a<='z';a++) {
		System.out.print(a);
	}
}

//print vowel
public static void vowel() {
	char[] vowel= {'a','e','i','o','u'};
	for(char a='a';a<'z';a++) {
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println("vowel is "+a);
		}else {
			System.out.println("char is "+a);
		}
	}
}

//multiplication table
public static int multiplication(int num) {
	int val = 0;
	for(int i=1;i<=10;i++) {
		val=i*num;
		//System.out.println(val);
	}
	return val;
}

//String program
public String stringProg() {
	String name="SHIVARAMAKRISHNA";
	name=name.toLowerCase();
	name=name.concat(".N");
	if(name.equalsIgnoreCase("shivaramakrishna.n")) {
		System.out.println("both strings are same");
		System.out.println(name.length());
	}
			return name;
}

public static void main(String[] args) {
	//forLoop1();
	//System.out.println(forLoop2(5,10));
	//forLoop3();
	//swapNumbers(23,43);
	//evenOrOdd();
	//infinteLoop();
	//infinteWhileLoop();
	//doWhileLoop();
	//alphabets();
	System.out.println(multiplication(17));
	//vowel();
	ForLoopExamples fle=new ForLoopExamples();
	fle.stringProg();
}
}