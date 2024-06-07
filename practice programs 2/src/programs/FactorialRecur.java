package programs;


public class FactorialRecur {
	int n;
	FactorialRecur(int n){
		n = this.n;
	}
	
	
	
	static int fact(int n){
		if (n==0)
			return 1;
		return n*fact(n-1);
	}
	public static void  main(String args[]) {
		
		
		
		FactorialRecur memb = new FactorialRecur(fact(8));
		
	
		System.out.println(memb.fact(8));
	}
}
