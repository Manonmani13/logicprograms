package logic;

import java.util.Scanner;

public class Repeating {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length();i++) {
		sb.append(s.charAt(i));
		sb.append(s.charAt(i));
	}
	System.out.println(sb.toString());
		
	}

}
