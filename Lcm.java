package programs_2;
import java.util.*;
public class Lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		int n1 = sc.nextInt(); //12
		int n2 = sc.nextInt(); //24
		int gcd = 1;
		for(int i = 1; i<=n1 && i<=n2;i++)
		{
			if(n1%i ==0 && n2%i ==0)
			{
				gcd = i;
			}
		}
	     int lcm = (n1*n2)/gcd;  // (12*24)/12
		System.out.println(lcm); //24
		}
	}


