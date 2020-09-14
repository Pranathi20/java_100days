package num;
import java.util.*;
public class Disarium_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt(); 
		int n = num; 
		int len = count(num);
		int sum =0;
		
		while(num>0)  
		{
			int rem = num%10; 
			sum = sum + (int)Math.pow(rem, len);
			num = num/10; 
			len-- ;
		}
		if(sum==n)
			System.out.println(n+" is Disarium Number");
		else
			System.out.println(n+" is Not Disarium Number");
	}
   static int count(int n)
   {
	   int length = 0;
	   while(n !=0 ) 
	   {
		   length = length + 1;
		   n = n/10; 
	   }
	   return length; 
	}

}
