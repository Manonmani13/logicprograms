package com.logic;

import java.util.Scanner;

public class NVowels2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		s=s.replace("[aeiouAEIOU]","" );
		if(n>s.length())
			System.out.println("invalid");
		else
			System.out.println(s.substring(0,n));
	}
}
