package patternapp;

public class Pattern108 {
	public static void main(String[] args) {
		int k=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
					System.out.print(i+" ");
				else if(j==2) {
					System.out.print(i+k+" ");
				}
				else if(j==3) {
					System.out.print(i+k+3+" ");
				}
				else if(j==4) {
					System.out.print(i+k+5+" ");
				}
				else  {
					System.out.print(i+k+6+" ");
				}
			}
			System.out.println();
		}
	}
}
