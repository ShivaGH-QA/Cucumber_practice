package com.java.practice;

public final class ImmutabeClass {
	//Can we make our own immutable class ?
			//Yes if you follow below rule
			//1- Make class as final
			//2- Data member should be final
		//	3-Constructor which will set the value
		//	4- finally method which will access the data members,
	//immutable class cant change its behaviour and extend it we can just create object and use it 
//final variable should be initialized else this can be initialized in constructor aswell  as below
	public final String immVar;
	public ImmutabeClass(String immVar) {
		this.immVar=immVar;
		System.out.println(immVar);
	}
	
	public void show() {
		System.out.println("immutable class "+immVar);
	}
}
