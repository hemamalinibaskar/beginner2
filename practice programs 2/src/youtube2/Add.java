package youtube2;
class Mac{
	
	int num1;
	int num2;
	int num3;
	
	Mac(int a, int b, int c){
		num1 = a;
		num2 = b;
		num3 = c;
		
	}
	
	boolean isSame(Mac z) {
		z.num2++;
		if(num1 == z.num1 && num2 == z.num2 && num3 == z.num3)
			return true;
		return false;
	}
}


public class Add {
	public static void main(String args[]) {
		
		Mac p1 = new Mac(5,7,8);
		
		Mac s1 = new Mac(5,7,8);
		
		System.out.println(p1.isSame(s1));
		System.out.println(s1.num2);
		
		
	}
}
