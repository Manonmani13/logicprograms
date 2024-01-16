package logic;

import java.util.Scanner;

public class Double {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	boolean found=false;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			found=true;
		}
	}
		System.out.println(found);
}
}
