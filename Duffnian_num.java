package num;

public class Duffnian_num {

	public static void main(String[] args) {
		static int sum_div(int n)// n=35
		{
			int div =0;
			for(int i =1; i<= Math.sqrt(n); i++)// i =1..5
			{
				if(n%i==0)// 35%5==0
				{
					div = div + i + (n/i); // div=36+5+7=48
				}
			}
			return div; // div =48
		}
		
		static int gcd(int a, int b)// a=35, b=48
		{
			int gcd = 1;
			for(int i = 1; i<= a && i<=b; i++)  // i=36 -> f
			{
				if(a%i==0 && b%i==0)// 35%35==0 && 48%35==0
					gcd=i;	// gcd =1		
			}
			return gcd; // gcd =1
		}
		
		public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter number"); 
	 int a =sc.nextInt();  // n= 35
	int b = sum_div(a); // s = 48 
	System.out.println("sum of divisors :"+b);
	int gcd = gcd(a,b);
	System.out.println("gcd = "+gcd);
	if (gcd ==1) // ->t , if relatively prime
		System.out.println("Duffinian Number");
	else
		System.out.println("Not Duffinian Number");
		}  }


	}

}
