package programs_2;
import java.util.*;
public class sumofdigs {

	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter number :");
	  int n = obj.nextInt();  
	  int sum = 0;
	  while( n!=0)  
	  {
		  int rem = n%10;  
		  sum = sum + rem; 
		  n = n/10 ;  
	  }
		System.out.println("sum of digits = "+sum)	;  
	} }

