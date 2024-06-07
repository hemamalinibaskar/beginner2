package youtube2;
import java.util.*;

public class Digittwo {
	static boolean twoDigit(int n) {
		if(n>=10 && n<=99) 
			return true;
		
		return false;
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi there!!");
		System.out.println("Enter the number: ");
		
		int n = scan.nextInt();
		
		System.out.println(twoDigit(n));
		
		
		
	}

}
