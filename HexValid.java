package patter;

import java.util.Scanner;

public class HexValid {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(sc.nextLine().matches("#[A-Fa-f0-9]{6}"));
}
}
