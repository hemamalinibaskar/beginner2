package oopQueue;

public class Queue {
	public static void main(String args[]) {
		
		Impqueue q1 = new Impqueue();
		
		q1.enqueue(2);
		q1.enqueue(4);
		q1.enqueue(6);
		q1.enqueue(8);
		
		System.out.println(q1.dequeue());
		
		Impqueue q2 = new Impqueue();
		
		q2.enqueue(3);
		q2.enqueue(5);
		q2.enqueue(7);
		q2.enqueue(9);
		
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
	}
}
