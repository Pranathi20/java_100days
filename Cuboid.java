package Areas;
import java.util.*;
public class Cuboid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,h,area;
		System.out.println("Enter length:");
		l=sc.nextInt();
		System.out.println("Enter breadth:");
		b=sc.nextInt();
		System.out.println("Enter height:");
		h=sc.nextInt();
		area=l*b*h;
		System.out.println("Area of the cuboid="+area);

	}

}
