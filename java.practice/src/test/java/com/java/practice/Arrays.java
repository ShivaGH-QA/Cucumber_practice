package com.java.practice;

import java.sql.ResultSet;

public class Arrays {
	// arrays are fixed in size and if value is not assigned then it is by default 0
	//araays limitiation on type aswell like we cant multiple types like int, string 
	// arrays stores in the rows and columns places
	// arrays is iterable and default pkg is java java.lang.Object -> java.util.Arrays
	//1D array 
	public void arr() {
		int[] num2= {10,15,20,30,35,40,45,50}; // 1st way of declaring an array
		int num[]=new int[5]; // 2nd way of declaring an array
		num[0]=15;
		num[1]=20;
		num[2]=25;
		num[3]=30;
		//num[4]=50;
		int[] num3=new int[]{10,20,30,40,50};// 3rd way of declarin an array
		int temp=0;
		System.out.println("num4 arr valus is "+num[4]);
		for (int i=0;i<num2.length;i++) {
			System.out.println("num2 length "+num2.length);
			System.out.println(temp=temp+num2[i]);
		}
		
		for(int val:num2) {
			System.out.println("val is "+val);
		}
	}
	
	//2D array
	public void twoDArr() {
		int student2[][]={{2,5,7},{1,3,5,3},{9,7}};
		/*
		 * int student[][]=new int[2][3]; student[0][0]=10; student[0][1]=15;
		 * student[0][2]=20; student[1][1]=25; student[1][2]=30; student[1][3]=35;
		 */
        for(int[] val2:student2) {
        	for (int val3:val2) {
        	System.out.println("2D arr val "+val3);
        }
        }
	}
	
	//copy of aray fro one array to other
	public void copyArr() {
		int[] arr= {12,13,14,15};
		int[] arr2= arr;
		for (int val:arr2) {
			System.out.println("copied values "+val);
			
		}
	}
	
	//array in arguement
	public void arrArgs(int[] num) {
	
		for(int i=0;i<num.length;i++) {
			System.out.println("array values "+num[i]);
		}
	}
	
	// return array in arguement
		public String[] arrReturnArgs(String val) {
		
			//String val="90-36-41-77-67";
			String[] vals=val.split("-");
			return vals;
		}
		
		public void strArr() {
			String[] arrVal=arrReturnArgs("90-36-41-77-67");
			for (int i=0;i<arrVal.length;i++) {
				System.out.println(arrVal[i]);
			}
		}
	
	public static void main(String[] args) {
		Arrays aarr=new Arrays();
		aarr.arr();
		//aarr.twoDArr();
		//aarr.copyArr();
		//aarr.arrArgs(new int[]{10,20,30,40,50});
		//aarr.strArr();
	}
	

}
