package Formulas;
import java.util.Scanner;
public class Hexagon {

	public static void main(String[] args) {
		double s,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a side:");
		s=sc.nextDouble();
		a=(3*Math.sqrt(3)*(s*s))/2;
		System.out.println("Area of Hexagon:" +a);

	}

}
