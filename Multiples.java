package programs_2;
import java.util.*;
public class Multiples {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two numbers:");
	  int s = sc.nextInt();  // s = 15
	  int n = sc.nextInt(); // n = 120
	  System.out.println("Multiples of 3 and 5 are:");
	  for(int i = s; i<= n ; i++)
	  {
		  if(i%3==0 && i%5 == 0)
			  System.out.print(i +" ");
	  }
} }
	
	

