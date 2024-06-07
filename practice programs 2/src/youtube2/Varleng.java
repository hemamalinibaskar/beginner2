package youtube2;

public class Varleng {
	
	static int minval(int... vars) {
		int val = Integer.MAX_VALUE;// vars[0]
		for(int x: vars) {
			if(x<val) 
				val = x;
		}
		return val;
	}
	
	static double minval(double... vars) {
		double val = Integer.MAX_VALUE;
		for(double k: vars) {
			if(k<val)
				val = k;
		}
		return val;
	}
	
	public static void main(String args[]) {
		
		int m = minval(4, 7, 8, 3,4);
		System.out.println("Min value is: "+ m);
		
		double n =minval(3.4,5.7,0.3,8.4);
		System.out.println("Min val: "+ n);
		
		int p = minval();
		System.out.println(p);
		
		double d = minval();
		System.out.println(d);
		
		
	}

}
