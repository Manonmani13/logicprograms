package patternapp;

public class Pattern110 {
	public static void main(String[] args) {
		int k=6,l=12,m=13,s=1;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				if(i==j)
				System.out.print(i+" ");
				else if(j-i==1) {
					System.out.print(k+" ");
					k++;
				}
				else if(j-i==2) {
					System.out.print(l+" ");
					l--;
				}
				else if(j-i==3) {
					System.out.print(m+" ");
					m++;
				}
				else
					System.out.print(15+" ");
				
			}
			System.out.println();
		}
	}
}
