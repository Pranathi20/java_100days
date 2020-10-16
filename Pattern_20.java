package Patterns;

public class Pattern_20 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= -n; i--) 
		{
			for(int j=1; j<=Math.abs(i);j++)
			 System.out.print(" "); 
			
			for(int k=Math.abs(i); k<=n ;k++)
				System.out.print((char)(k+65)); 
				
				System.out.println();
		}
	}
}
