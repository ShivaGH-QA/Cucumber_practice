package com.java.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections_arrayList_Generics {
	
	public ArrayList<String> arrLis() {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Shiva");
	al.add("rzma");
al.add("krishna");
return al;
	}
	
	public static void main (String[] args) {
		Collections_arrayList_Generics ag=new Collections_arrayList_Generics(); // this will have more nber of methods
		// which will have methods from Arralylist class and List interface
		ArrayList<String> arli=ag.arrLis();
		arli.add("Bellary");
		System.out.println(arli);
		
		for (String al:arli) {
			System.out.println("array list generics example "+al);
		}
		
		List<String> ll=new ArrayList<String>(); // this will have less nber of methods
		// which will have methods List interface only but not from ArrayList class
		//ll
		
		
		Collection<String> cl=new ArrayList<String>();//this will have less nber of methods
		// which will have methods from collections only
		//cl
		
	}

}
