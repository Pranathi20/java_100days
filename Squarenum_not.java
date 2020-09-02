package Areas;
import java.util.*;
public class Squarenum_not {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		double x = obj.nextDouble();
		double sr = Math.sqrt(x);
		if( ( sr - Math.floor(sr)) == 0)
			 System.out.println("Square Number");
		else
			System.out.println(" Not Square Number ");

	}

}
