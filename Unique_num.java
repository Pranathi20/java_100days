package programs_2;
import java.util.*;
public class Unique_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();  
		int c, flag = 1;
		int no = n; 
		for(int i=0 ; i<= 9; i++)
		{  
			n = no; 
			c = 0;
			while( n > 0) 
			{
				int d = n%10 ; 
				if(d == i ) 
					c++; 
				n =n /10; 
			}
			if (c > 1) 
			{
				flag =0;
				break;
			}
		}
			if(flag ==1 ) // unique			 
				System.out.println("It is a Unique Number");
				else // flag = 0
			System.out.println("It is Not a Unique Number");
	} }

	


