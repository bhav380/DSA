package Queue;
import java.util.Stack;

public class queueUsing2Stacks<T> {
	
	private Stack<T> s1;
	private Stack<T> s2;
	
	private int size;
	
	public queueUsing2Stacks() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public void enqueue(T data) {
		
		s1.push(data);
		size++;
	}
	
	public T dequeue() throws QueueEmptyException {
		
		if(size==0) {
			
			throw new QueueEmptyException();
			
		}
		
		while(s1.size()!=1) {
			s2.push(s1.pop());
		}
		
		T data = s1.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		size--;
		return data;
		
		
	}
	
	
	
	

}
