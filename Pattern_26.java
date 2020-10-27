package Patterns;
public class Pattern_26
{
public static void main(String[] args) {
	int n = 5;
	int x = n; // x = 5
	int y = n; // y = 5
	
	for(int i = 1; i <= n; i++) // i = 1,2,3,4,5
	{
		for(int j= 1; j<= (n*2)-1; j++)// j= 1,2,3,4,5,6,7,8,9
		{
			if(j==x || j==y) // 5==5||5==5 -> t
				System.out.print(i);  //*
			else
				System.out.print(" ");
		}
		System.out.println();
		x = x-1; // x = 4,3,2,1
		y = y+1; // y = 6,7,8,9
	}
}}