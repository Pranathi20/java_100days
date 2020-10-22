package Patterns;

public class Pattern_25 {

	public static void main(String[] args) {
		int n = 4;
		int x= 1;
		for(int i = n; i>= -n; i--)
			{
			for(int j= 1; j <= Math.abs(i); j++) // j=1,2,3,4
				System.out.print(" ");
			
			for(int k=n; k >= Math.abs(i); k--) // k = 4>=4			
				System.out.print((char)(x+64)+" "); // A
			
			System.out.println();
			     
			if(i>0)
			x = x+1; // x=2,3,4,5   
			else
				x=x-1; //x= 4,3,2,1					
		}
} }

	
