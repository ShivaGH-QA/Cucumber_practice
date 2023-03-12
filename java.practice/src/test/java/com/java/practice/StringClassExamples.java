package com.java.practice;

public class StringClassExamples {
	
	String name="Shiva rama krishna N";
	int i=0;
	public String strArry() {
		String[] strArr=name.split(" ");
/*		for (int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		return name;
	}*/
		while (i<strArr.length) {
			System.out.println("val is "+strArr[i]);	
			i++;
		}
		return name;
	}
	ForLoopExamples fle2=new ForLoopExamples();
	public void callClass() {
		fle2.stringProg();
	}
	
	
	private void syste() {
		String val=name.concat("JAVA");
System.out.println(val);		

	}
	
	public static void main(String[] args) {
		StringClassExamples sce=new StringClassExamples();
		//sce.strArry();
		System.out.println("last statmet "+sce.strArry());
		String name="Test";
		
	}

}
