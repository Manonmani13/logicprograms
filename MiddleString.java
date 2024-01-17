package logic;

import java.util.Scanner;

public class MiddleString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=s.length();
	if(n%2==0)
		System.out.println(s.substring(n/2-1,n/2+1));
	else
		System.out.println(s.substring(n/2,n/2+1));
}

}
