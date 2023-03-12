package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;

//Collection
// collections is a data structure to store data.
// collections frameworks provides an architecture to store and manipulate the data
// opearations like inserting, manipulate, sorting, deleting are performed with help
//of collectins
// collections have interfaces (list, set) and classes like (Array list, linked list, hash set, Linked hash set))

// Array List
// ANS:- it is dynamic data structure it can accpet data dynamically 
// Dulpicate data is allowed to store
// Arraylist reserves the insertion order
// Values in Array list can be accessed based on the indexing
// manipulation is slower in array list when the value in removed in array list, rearranging will take time.
// Array list functions like add, get, iterator, size, remove, toArray etc 
/**
 * Collections in java is a framework that provides an architecture to store and
 * manipulate the group of objects. colleton is JAVA handles the objects no nned to give data type
 * 
 * + All the operations that you perform on a data such as searching, sorting,
 * insertion, manipulation, deletion etc. can be performed by Java Collections.
 * * Java Collection framework provides many interfaces (Set, List, Queue,
Deque etc.) and classes (ArrayList, Vector, LinkedList, PriorityQueue,
HashSet, LinkedHashSet, TreeSet etc).

Generic in Collection

1- Java new generic collection allows you to have only one type of object in
collection. Now it is type safe so typecasting is not required at run time.

Non-generic arraylist
ArrayList al=new ArrayList();

2- Generic example of creating java
ArrayList<String> al=new ArrayList<String>();

In generic collection, we specify the type in angular braces. Now ArrayList is
forced to have only specified type of objects in it. If you try to add another
type of object, it gives compile time error.


 */


public class Collections_ArrayLisst {

	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1234);
		al.add("String");
		al.add("String");
		al.add('M');
		al.add(true);
		al.add(12.12);
		
		System.out.println("size "+al.size());
		System.out.println(al);
		System.out.println("arraylist obj "+al.get(3));
		Object[] arr=al.toArray();
		for (int i=0; i<arr.length;i++) {
			System.out.println("arraylist to array is "+arr[i]);
		}
		
		for (int i=0;i< al.size();i++) {
			System.out.println("array list vals "+al.get(i));
		}
		for(Object e:al) {
			System.out.println("val of "+e);
		}
		
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			String val=itr.next().toString();
			System.out.println("iterator values "+val);
		}
		
	}
	
}
