package PriorityQueue;

public class Use_Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Priority_Queue<String> pq = new Priority_Queue<>();
		
		for(int i=20; i>=0; i-=3) {
			String s = "hello"+i;
			pq.insert(s, i);
		}
		
		pq.print();
		

	}

}
