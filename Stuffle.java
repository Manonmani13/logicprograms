package logic;
import java.util.Scanner;

public class Stuffle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer();
	sb.append(s.charAt(0));
	sb.append(s.charAt(1));
	sb.append("...");
	sb.append(s.charAt(0));
	sb.append(s.charAt(1));
	sb.append("...");
	sb.append(s);
	sb.append("?");
	System.out.println(sb.toString());
}
}
