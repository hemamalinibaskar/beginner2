package youtube2;

class Maths{
	int length;
	int breadth;
	int height;
	
	Maths(int l, int b, int h){//Constructor
		length = l;
		breadth = b;
		height = h;
	}
	
	/*void setdim(int length, int breadth, int height) {  //this keyword
		this.length = length;
		this.breadth = breadth;
		this.breadth = height;
	}*/
	void setdim(int l, int b, int h) {  //this keyword
		length = l;
		breadth = b;
		height = h;
	}
	
	int volume() {
		int vol = length*breadth*height;
		return vol;
	}
}


public class Boxnew {
	public static void main(String args[]) {
		
		Maths Woodbox = new Maths(2, 4, 5);
		
		Woodbox.setdim(3, 6, 8);
		
		Maths Redbox = new Maths(4, 7, 8);
		
		System.out.println(Redbox.volume());
		
		System.out.println(Woodbox.volume());
		
		
	}

}
