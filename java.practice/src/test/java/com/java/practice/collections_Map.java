package com.java.practice;

import java.util.HashMap;

public class collections_Map {
	
	/*
	 * What is Map in Java > Map is a Interface in Java & classes is HashMap, LinkedHashMap, treeMap
	 *  » Map Contains Key and
	 * Value pair. » Each key and Value called as Entry. > Map contains only unique
	 * keys. > Map is easy to use if you have to search, update or delete elements
	 * on the basis of key. » Example- Search Students based on their roll number. »
	 * Fetch Customer details from DB based on their customer id and so on
	 */
	
	/*
	 * What is HashMap > Java HashMap a class which implements the map interface. >
	 * A HashMap also contains values based on the key and only unique elements. >
	 * It may have one null key and multiple null values. > Main Point- It does not
	 * store value in order
	 * Map do not allow the duplicate values
	 */

	public static void main(String[] args) 
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("name", "Shiva");
		hm.put("Id", "1");
		hm.put("Class", "SSLC");
		hm.put("School", "Vasavi");
		hm.put("Sub", "Eng");
		
		System.out.println(hm);
		
		System.out.println("hash map val is "+hm.get("name"));
		
	}
	
}
