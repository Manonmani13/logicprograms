package logic;

import java.util.Scanner;

public class ValidZipCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.nextLine().matches("[0-9]{5}"));
	}
}
