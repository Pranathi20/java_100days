package Formulas;
import java.util.Scanner;
public class Octagon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float s,a;
		System.out.println("Enter the length of a side");
		s=sc.nextFloat();
		a=(float)(2*(1+Math.sqrt(2)*s*s));
		System.out.println("Area of Octagon:"+a);

	}

}
