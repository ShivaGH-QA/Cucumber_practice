package com.java.practice;

public class randomExamples {
	// all the variables are declared are global variables
	// 1.create a const and initialize it in arguements and add it
	// 2.create a const and initialize it using this and use thsoe variables into
	// another method to perform add
	// 3.create a method and call them in main method .

	int x;
	int y;
	int val;

	public randomExamples(int a, int b) {
		int c = a + b;
		System.out.println("const add" + c);
		this.x = a;
		this.y = b;
	}

	public int constAdd() {
		val = x + y;
		return val;
	}

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
// descio making examples
	public void decisionMaking() {
		if (x > y) {
			System.out.println("x is greater " + x);
		} else {
			System.out.println("y is greater number");
		}

		switch ("non") {
		case "add":
			System.out.println("adding " + x + y);
			break;
		case "mul":
			System.out.println("multiply " + x * y);
			break;
		case "div":
			System.out.println("div " + x / y);
			break;
		default:
			System.out.println("no function");
		}
	}

	// arrays examples
	public void intArr() {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=30;
		System.out.println("arr len "+nums.length);
		
		int[] vals=new int[] {21,21,22,23,24,2,25,26,27,21};
		System.out.println(" new len "+vals.length);
	}
	
	public String[] names() {
		//String[] nams=new String[] {"shiva","rama","krishna","N","Bly"};
		String names="Shiva rama krishna N";
		String[] nams=names.split(" ");
		return nams;
	}
	
	public void arrArgs(int[] val, int[] num) {
		System.out.println(val.length);
		System.out.println(num.length);		
		for (int i=0; i<val.length;i++) {
			System.out.println("value vals "+val[i]);
		}		
		for (int j=0; j<val.length;j++) {
			System.out.println("value vals "+val[j]);
		}	
	}
	
	public static void main(String[] args) {
		randomExamples re = new randomExamples(7, 8);
		int z = re.constAdd();
		System.out.println("canst add val " + z);
		re.add(5, 6);
		re.decisionMaking();
		re.intArr();
		String[] namz=re.names();
		for (String hesaru:namz) {
			System.out.println("hesaru "+hesaru);
		}
		re.arrArgs(new int[] {12,13,14,15}, new int[] {20,21,22,23});
	}

}
