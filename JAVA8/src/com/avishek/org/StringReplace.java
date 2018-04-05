package com.avishek.org;

public class StringReplace {

	public static String encodeStringChars(int offset, String str){
		return str;
		
	}
	
	public static void main(String[] args) {
		StringBuilder myName = new StringBuilder("avishek");
		myName.setCharAt(3, 'j');
		System.out.println(myName);
	}

}
