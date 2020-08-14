package File1;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) 
	{
	 double l,b,area;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter length:");
	 l=sc.nextDouble();
	 System.out.println("Enter breadth");
	 b=sc.nextDouble();
	 area=(l*b);
	 System.out.println("Area of rectangle is:"+area);
	}

}
