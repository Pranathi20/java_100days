package Patterns;

public class Pattern_21 {
	public static void main(String[] args) {
	int n = 5;
	for(int i = 1; i<= n; i++)  // i = 1, 2,3,4,5
	{
		for(int k = n-1; k >= i; k--) 
		{
			System.out.print(" "); 
		}
		for(int j = 1; j <=i ; j++ ) 
		{
			System.out.print("* "); 
		}
		System.out.println();
	}
}

}
