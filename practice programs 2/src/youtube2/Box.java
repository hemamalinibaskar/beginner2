package youtube2;
import java.util.*;

class Demo {
	int length;
	int breadth;
	int height;
	static int boxcount;
	
	Demo(int l, int b, int h){
		length = l;
		breadth = b;
		height = h;
		boxcount++;
	}
	
	Demo(int l){
		length =breadth = height = l;
		boxcount++;
		
	}
	
	int surfaceArea() {
		return 2*((length*breadth)+(breadth*height)+(length*height));
		
	}
	
	Demo Triple() {
		Demo Temp = new Demo(length * 3, breadth * 3, height * 3);
				return Temp;
	}
	
	boolean isEqual(Demo s) {
		if(length == s.length && breadth == s.breadth && height == s.height)
			return true;
		return false;
	}
	
	static {
		System.out.println("Static block");
		boxcount = 0;
	}
	
	static void displayBoxcount(){
		System.out.println("Box COunt: "+ boxcount);
		
	}
}

public class Box{
	public static void main(String args[]) {
		System.out.println("Whitebox values");
		Demo whitebox = new Demo(7, 5, 7);
		System.out.println("Finished whitebox");
		Scanner sc = new Scanner(System.in);
		System.out.println("s2 box");
		Demo s2 = new Demo(7, 8, 7);
		System.out.println("s2 box finished");
		
		/*System.out.println("Enter the length: ");
		s2.length = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the breadth: ");
		s2.breadth = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the height: ");
		s2.height = sc.nextInt();
		sc.nextLine();
		
		
		
		
		
		
		System.out.println("Surface Area = "+ whitebox.surfaceArea());*/
		
		System.out.println(whitebox.isEqual(s2));
		
		Demo box1 = whitebox.Triple();
		
		System.out.println(box1);
		
		System.out.println(Demo.boxcount);
		
		Demo.displayBoxcount();
		
	}
	
}

