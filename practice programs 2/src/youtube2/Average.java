package youtube2;

class Avg{
	
	int Avg(int a, int b, int c) {
		return (a+b+c)/3;
	}
	
	int Avg(int a, int b) {
		return (a+b)/2;
	}
}

public class Average {

	public static void main(String args[]) {
		
		Avg count = new Avg();
		System.out.println(count.Avg(4, 4));
		System.out.println(count.Avg(8, 2, 8));
	}
}
