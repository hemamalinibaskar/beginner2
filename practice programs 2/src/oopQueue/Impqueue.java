package oopQueue;

public class Impqueue {
	
	int num[] = new int[8];
	int fq;
	
	void Impqueue() {
		
		int fq = -1;
	}
	
	void enqueue(int n) {
		
		if(fq == 8)
			System.out.println("Queue is Full");
		else
			num[++fq] = n;
		
	}
	
	int dequeue() {
		if(fq >= 0) {
			fq = (fq+1)% fq;
			fq--;
			return fq;
		}
		else
			return -1;	
		
		
	}

}
