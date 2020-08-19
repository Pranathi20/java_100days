package Formulas;
import java.util.Scanner;
public class Pentagon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of a pentagon:");
		int s=sc.nextInt();
		System.out.print("Enter the length of apothem");
		int a=sc.nextInt();
		float area=(float)(5/2)*s*a;
		System.out.println("Area of Pentagon is:"+area);


	}

}
