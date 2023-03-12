package com.java.interfaces;

public interface InterfaceI {
int x=10;
public void add(int a, int b);
public void mul(int a, int b);
}
// Interface will have only the method declarations and the implementation will be done in other class
// variables inside interface are by default static final and those cant be changed in other classes./
//interface implements the menthods in other class
//we cant create object for interfaces.
// interface achives 100% abstraction
// Below are allowed 
//1> Interface1(reference) i1=new interface1()(object); both interface methods and class methods(method created inside the class)
//are avaialble with the reference.
//2> Interface(parent/base) i2=new  interface2()(child); parent can hold child so the methods inside child are only
//visible but not parent
//3> interface (parent) i3=new interface() (interface/base) //this is invalid interface can't be insttantiated without method'
//impementation
//4> interface3(child) i4=new interface() (inerface/base) // this is invalid interface can't be insttantiated without method'
//impementation
//Interface can extend the multiple interfaces
//a class can implement multiple interfaces and once implemented then we can implement the extended(multiple) interfaces.
//an interface can extend multiple interfaces.
// a classs cant extend multple classes .
//ex- public class class_name extends class1, class2{}