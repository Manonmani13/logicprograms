package patter;

import java.util.Scanner;

public class HexValid2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
String s=sc.nextLine().toUpperCase();
int count=0;
if(s.charAt(0)=='#'&& s.length()==7)
{
	for(int i=1;i<s.length();i++) {
		if((s.charAt(i)>='A'&&s.charAt(i)<'F')||Character.isDigit(s.charAt(i))) {
			count++;
		}
	}
}
System.out.println(count);
}
}
