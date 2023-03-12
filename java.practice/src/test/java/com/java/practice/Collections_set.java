package com.java.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_set {
	
	/*
	 * What is Set and LinkedSet, HashSet, TreeSet How to write Set
	 * Get values from Set
	 * Some Operation on Set
	 * Convert Set into List
	 * Where we can use this concept in Selenium
	 */
	/*
	 * What is Set (Interface) - Hash set, Linked Hash Set, Tree set
	 * > Set in interface in java which extends Collection interface. > Set does not
	 * set does not allow duplicate values
	 *Set is unordered collection i.e Set will not store the insertion order
	 * > Can't be accessed using index since it does not store the order
	 */	
	
	/*
	 * HashSet
	 * » HashSet stores the elements by using a mechanism called hashing. It means
	 * we can not access using index.
	 * » HashSet contains unique elements only.
	 * Hash set is faster than the Indexing
	 * 
	 * LinkedHashSet
> It is similier to HashSet but it Maintains insertion order.
	 * 
	 * TreeSet
» Maintains ascending order.
	 */
		
	public void set2arrList() {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("bangalore");
		hs.add("Hyd");
		hs.add("OGL");
		hs.add("1");
		
		ArrayList al=new ArrayList(hs);
//		al.add("shiva");
//		al.add(100);
//		al.add("Bellary");
			
		System.out.println("set value as list "+al.get(2));
		
	}
	
	public static void main (String[] args) {
		HashSet<String> hs=new HashSet<>();
		Set<String> hs1=new HashSet<>();
		Collection<String> hs2=new HashSet<>();
		hs.add("bangalore");
		hs.add("bangalore");
		hs.add("Hyd");
		hs.add("OGL");
		hs.add("1");
		hs.add("12.12");
		hs.add("A");
		
		System.out.println(hs);
		for (String hss:hs) {
			System.out.println("hash set values "+hss);
		}
		
		Iterator itr=hs.iterator();
		while (itr.hasNext()) {
			String hsItr=itr.next().toString();
			System.out.println("hsItr values is "+hsItr);
		}
		Collections_set cs=new Collections_set();
		cs.set2arrList();
	}
	
}
