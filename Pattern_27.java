package Patterns;

public class Pattern_27 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i= 1; i<= n;i++) // i = 1,2,..5 rows
		{
			 for(int j=1; j < n*2; j++) // j = 1,2,3..9 cols
			 {
				 if(j <= i || j>= n*2-i) // 9 <= 2 || 9 >= 8 -> t
					 System.out.print("*"); 
				 // 1,9  -> 1 row
				 //1,2 .... 8,9 -> 2 row
				 else
					 System.out.print(" "); // 7,5,3,1,0 ->spaces
			 }
			 
			 System.out.println();
		}
} }


