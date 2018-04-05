package com.avishek.org;
import java.util.*;

public class MyException {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 10, 20, 0);
		integers.forEach(i -> {
		    try {
		        System.out.println(50 / i);
		    } catch (ArithmeticException e) {
		        System.err.println(
		          "Arithmetic Exception occured : " + e.getMessage());
		    }
		});
	}

}
