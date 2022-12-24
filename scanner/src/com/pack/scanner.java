package com.pack;

import java.util.Scanner;

public class scanner {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s = new Scanner(System.in);
		System.out.println("Enter Username");
		String Username= s.next();
		
		

		System.out.println("Enter password");
		String password= s.next();
		
		System.out.println("\n");
		
		System.out.println("Username is : "+Username );

		System.out.println("password is : "+password );
		
	}

}
