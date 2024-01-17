package logic;

import java.util.Scanner;

public class VowelRemover {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println(sc.nextLine().replaceAll("[aeiou]", sc.nextLine()));
}
}
