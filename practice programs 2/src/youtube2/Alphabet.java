package youtube2;

class Alp{
	char alp1;
	char alp2;
	
	Alp(char a1, char a2){
		alp1 = a1;
		alp2 = a2;
	}
	
	Alp Triple(){
		Alp temp = new Alp(alp2 , alp1);
		return temp;
		
	}
	String isEqual(Alp a) {
		a.alp2++;
		if(alp1 == a.alp1 && alp2 == a.alp2)
			return "Same";
		return "Not Same";
	}
}

public class Alphabet {
	public static void main(String args[]) {
		
		Alp box1 = new Alp('h','l');
		
		Alp box2 = new Alp('h','l');
		
		System.out.println(box1.isEqual(box2));
		System.out.println(box2.alp2);
		
		Alp box3 = box2.Triple();
		
		System.out.println(box3.alp1);
		
		
		System.out.println();
	}
}
