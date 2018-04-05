package com.avishek.org;

import java.io.PrintWriter;

public class Tester {

	public static void main(String[] args) {
		PrintWriter p;
		p = System.console( ).writer( );
		if(Math.random( ) > 0.5)   p.println(1);
		else   p.println(2);
		p.println(3);
		p.close( );
	}

}
