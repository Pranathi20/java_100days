package Patterns;

public class Pattern_9{
   public static void main(String[] args) {
	for(int i = 5; i>=1;i--) // 5 rows, i = 5
	{
		for(int j=1; j<=i;j++) // 5 cols
		{
			System.out.print(j +" "); //1 2 3 4 5
		}
		System.out.println();
	}
} }

