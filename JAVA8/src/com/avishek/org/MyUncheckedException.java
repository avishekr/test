package com.avishek.org;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/*
 * @author avishek
 * throwing checked exceptions from lambda expressions
 */


public class MyUncheckedException {
	static void writeToFile(Integer integer) throws IOException {
	    // logic to write to file which throws IOException
	}
	public static void main(String args[]) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i -> {
		    try {
		        writeToFile(i);
		    } catch (IOException e) {
		        throw new RuntimeException(e);
		    }
		});
	}
}
