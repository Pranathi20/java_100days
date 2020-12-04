package Strings;
import java.util.*;
public class CamelCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter String: ");
		String input = in.next(); 
		
		int len = input.length();  
		
		if(len == 0)
		{
			System.out.println(0);
		}
		
		int count = 1;
		
		for(int i =0; i<len; i++)
		{
			char c = input.charAt(i);
			if( 'A' <= c && c <='Z')
				count++; // 2
			else if(c == ' ')
				break;				
		}
		System.out.println(count);
	}

}
