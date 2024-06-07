package youtube2;
import java.util.*;

class Student{
	String Name;
	int Roll_no;
	int marks[] = new int[5];
	

		
	
	
	void marksTotal() {
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks: ");
		for(int i = 0;i<marks.length;i++) {
			marks[i] = scan.nextInt();
			sum = sum + marks[i];	
		}
		System.out.println("Your Total marks is: "+ sum);
		
		
	}
}

public class Studdata {
	public static void main(String args[]) {
		
		Student marklist = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		marklist.Name = sc.nextLine();
		System.out.println("Your name: "+ marklist.Name);
		
		System.out.println("Enter Roll.no: ");
		marklist.Roll_no = sc.nextInt();
		System.out.println("Your Roll.no is: "+ marklist.Roll_no);
		
		marklist.marksTotal();
		
	}

}
