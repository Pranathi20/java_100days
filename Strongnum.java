package programs_2;
import java.util.*;

public class Strongnum {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); 
		int fact, rem, sum = 0, temp;
		temp = n; 
		while(n != 0)  
		{
			fact = 1;
			int i = 1;
			rem = n%10;  
		  	
			while(i <= rem) 
			{
				fact = fact * i;
				i++;
			}
			sum = sum + fact ; 
			n = n/10;  
		}
         if ( sum == temp) 
        	 System.out.println(temp + " is a Strong Number" );
         else
        	System.out.println(temp + " is not a Strong Number"); 
} }

