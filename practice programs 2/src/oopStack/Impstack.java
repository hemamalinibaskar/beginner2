package oopStack;

public class Impstack {
	
	String arr[] = new String[9];
	int fs;
	
	Impstack(){
		fs = -1;
	}
	
	void push(String val) {
		if(fs == 9)
			System.out.println("Stack is full");
		else
			arr[++fs] = val;
		
	}
	
	String pop(){
		if(fs >= 0)
			return arr[fs--];
		else
			return "Stack is empty";
			
	}

}
