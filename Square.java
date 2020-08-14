package File1;
import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
	  System.out.println("Enter side of square:");
	  Scanner sc=new Scanner(System.in);
	  double side=sc.nextDouble();
	  double area=side*side;
	  System.out.println("Area of square is:"+area);
	}
}
	
