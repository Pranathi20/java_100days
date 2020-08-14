package File1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		int r;
		double pi=3.14,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area of the circle:"+area);

	}

}
