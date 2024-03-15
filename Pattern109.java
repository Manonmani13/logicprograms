package patternapp;

public class Pattern109 {
	public static void main(String[] args) {
		int k=9,l=10,m=14;
		for(int i=1;i<=5;i++){
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==j)
				System.out.print(i+" ");
				else if(i-j==1) {
					System.out.print(k+" ");
					k--;
				}
				else if(i-j==2 ) {
					System.out.print(l+" ");
					l--;
				}
				else if(i-j==3 ) {
					System.out.print(m+" ");
					m--;
				}
				else
					System.out.print(15+" ");
				
			}
			System.out.println();
		}
	}
}
