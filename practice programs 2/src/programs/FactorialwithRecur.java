package programs;
import java.util.*;

public class FactorialwithRecur {
	static int printFact(int n) {
		if(n==0)
			return 1;
		else 
				return n*printFact(n-1);
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,fact=1;
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		fact = printFact(num);
		
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
