package programs_2;
import java.util.*;
public class SumofEvenOdd {
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner (System.in);
	  System.out.println("enter number :");
	  int n= obj.nextInt();  // 1234
	  int even_sum =0,  odd_sum =0;
	  while(n!=0)
	  {
		  int rem = n%10;  
		  if (rem%2 == 0)  
		    even_sum = even_sum+rem;  
		  else  
			  odd_sum = odd_sum + rem;   		  
		  n = n/10; 
  	  }
	 System.out.println("even sum = "+ even_sum);
	 System.out.println("odd sum = "+ odd_sum); 
	}	}