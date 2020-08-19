package Formulas;
import java.util.Scanner;
public class Equilateraltriangle {

	public static void main(String[] args) {
		float s,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a triangle:");
		s=sc.nextFloat();
		a=(1.73f*s*s);
		System.out.println("Area of Equilateral triangle:"+a);
		

	}

}
