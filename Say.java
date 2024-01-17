package logic;

import java.util.Scanner;

public class Say {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int d=sc.nextInt();
		System.out.println((d==1)?"Hello "+s:"Bye "+s);
	}
}
