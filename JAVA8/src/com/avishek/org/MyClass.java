package com.avishek.org;

import java.util.*;
import java.util.function.Consumer;

public class MyClass { 
	public static void main(String[ ] args) {
		List<String> list = new ArrayList( );
		list.add("Tim");
	    list.add("Bob");
	    list.add("Frank");
	    list.add("Jill");
	    list.stream( ).peek(s -> System.out.println(s));
	   }
}
