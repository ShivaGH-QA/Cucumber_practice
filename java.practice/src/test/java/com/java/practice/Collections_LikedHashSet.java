package com.java.practice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections_LikedHashSet {

	public void linkhasSet() {
	LinkedHashSet<String> lhs=new LinkedHashSet<>();
	lhs.add("bangalore");
	lhs.add("bangalore");
	lhs.add("Hyd");
	lhs.add("OGL");
	lhs.add("1");
	lhs.add("12.12");
	lhs.add("A");
	
	System.out.println("Linked Hash set "+lhs);
	}
	
	public void treset() {
		TreeSet ts=new TreeSet();
		ts.add("bangalore");
		ts.add("bangalore");
		ts.add("Hyd");
		ts.add("OGL");
		ts.add("1");
		ts.add("12.12");
		ts.add("A");
		
		System.out.println("trees et values "+ts);
	}
	
	public static void main(String[] args) {
		Collections_LikedHashSet clhs=new Collections_LikedHashSet();
		clhs.linkhasSet();
		clhs.treset();
	}
	
}
