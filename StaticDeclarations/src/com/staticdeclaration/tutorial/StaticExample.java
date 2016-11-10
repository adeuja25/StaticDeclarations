package com.staticdeclaration.tutorial;

public class StaticExample {

	public static void main(String[] args) {
		StaticDeclarations.setTestValue(5);
 
		// non-private static variables can be accessed with class name
		StaticDeclarations.testString = "\nAssigning testString a value";
		StaticDeclarations csd = new StaticDeclarations();
		System.out.println(csd.getTestString());
 
		// class and instance static variables are same
		System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
		System.out.println(StaticDeclarations.testString == csd.testString);
		System.out.println("Why? Because: StaticDeclarations.testString == csd.testString");
	}
}
