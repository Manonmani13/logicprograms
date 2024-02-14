package array;

import java.util.Scanner;

public class MaximumFinder {
public static void main(String[] args) {
	int max=0;
	int n[]=new int[6];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<6;i++)
	{
		n[i]=sc.nextInt();
	}
	max=n[0];
	for(int i=0;i<n.length;i++)
	{
		if(max<n[i])
		{
			max=n[i];

		}
	}
	System.out.println(max);
}
}
