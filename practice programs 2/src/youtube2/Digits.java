package youtube2;
import java.util.*;

public class Digits {

static int digitSum(int num){
	
	int sum = 0;
	for(sum=0;num>0;sum+= num%10,num/=10) {
	}
	return sum;
}



	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello there!!!");
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		
		System.out.println("Here is the sum of digits of the number you've entered: ");
		System.out.println(digitSum(num));
		
	
	}

}

