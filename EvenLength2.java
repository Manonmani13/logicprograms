package patter;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenLength2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split(" ");
for(int i=0;i<st.length;i++) {
			if(st[i].length()%2==0) {
				System.out.print(st[i]+" ");
			}
		}
	}
}
