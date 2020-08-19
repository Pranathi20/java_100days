package Formulas;
import java.util.Scanner;
public class Heptagon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float s,a;
		System.out.println("Enter length of a side:");
		s=sc.nextFloat();
		a=3.634f*s*s;
		System.out.println("Area of Heptagon:"+a);

	}

}
