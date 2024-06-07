package programs;
import java.util.Scanner;
public class Fiborecur {
	static int i,n1=0,n2=1,n3;
	
	
	static void Fibonacci(int count) {
		if(count>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			Fibonacci(count-1);
			
			
		}
		
			
	}
	
	public static void main(String args[]) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count: ");
		int count = sc.nextInt();
		
		System.out.print(n1 +" "+n2);
		Fibonacci(count-2);
	}

}
