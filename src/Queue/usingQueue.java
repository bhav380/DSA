package Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class usingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> r = new LinkedList<Integer>();
		
		int[] arr = {38,3,6,2,66,2};
		for(int elem : arr) {
			q.add(elem);
			r.add(elem);
		}
		
		r.remove();
		r.add(4);
		
		System.out.println(q.equals(r));
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		myQueueArray q = new myQueueArray();
//		
//		q.enqueue(18);
//		q.enqueue(28);
//		q.enqueue(38);
//		q.enqueue(1238);
//		q.enqueue(158);
//		
//		
//		
//		q.dequeue();
//		
//		q.dequeue();
//		
//		q.enqueue(19);
//		q.enqueue(388);
//		q.enqueue(4848);
//		
//		
//		
//		//q.dequeue();
//		System.out.println(q.size());
//		System.out.println(q.front());
//		
//		q.enqueue(8383);
//		System.out.println(q.size());
//
//		q.enqueue(8383);
//		System.out.println(q.size());
//
//		q.enqueue(83893);
//		System.out.println(q.size());
//		
//
//
//		q.enqueue(8383);
//		System.out.println(q.size());
//
//		
//		q.enqueue(8383);
//		
//		System.out.println(q.front());
//		System.out.println(q.size());
//	
//		System.out.println(q.front());
//		System.out.println(q.dequeue());
//		System.out.println(q.front());
		

	}

}
