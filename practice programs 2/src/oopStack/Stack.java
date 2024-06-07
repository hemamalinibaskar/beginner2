package oopStack;

public class Stack {
	public static void main(String args[]) {
		
		Impstack s1 = new Impstack();
		
		s1.push("a");
		s1.push("z");
		s1.push("r");
		s1.push("d");
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		Impstack s2 = new Impstack();
		
		s2.push("v");
		s2.push("e");
		s2.push("r");
		s2.push("y");
		
		System.out.println(s2.pop());
		
	}
}
