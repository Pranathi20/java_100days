package File1;

import java.util.Scanner;

public class Simpinterest {

	public static void main(String[] args) {
		float p,r,t,sinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		p=sc.nextFloat();
		System.out.println("Enter rate");
		r=sc.nextFloat();
		System.out.println("Enter the time");
		t=sc.nextFloat();
		sinterest=(p*r*t)/100;
		System.out.println("Simple interest is:"+sinterest);
				

	}

}
