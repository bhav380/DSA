package Queue;


public class myQueueArray {
	
	private int[] data;
	private int front;
	private int rear;
	private int size;
	
	public myQueueArray() {
		data = new int[5];
		front=-1;
		rear = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(int elem) {
		
		if(size==data.length) {
			doubleCapacity();
		}
		
		
		data[rear] = elem;
		
		rear = (rear+1)%data.length;
		
		
		if(front==-1) {
			front=0;
		}
		size++;
		

	}
	
	public int dequeue() {
		
		if(size==0) {
			return -1;
		}
		
		size--;
		
		
		
		int tmp = data[front];
		
		front = (front+1)%data.length;
		
		
		
		if(size==0) {
			front=-1;
			rear=0;
		}
		
		return tmp;	
	}
	
	public int front() {
		if(size==0) {
			return -1;
		}
		
		return data[front];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		
		int[] tmp = new int[data.length*2];
		for(int i=front; i<data.length; i++) {
			tmp[i-front] = data[i];
		}
		
		for(int i=data.length-front,j=0; i<data.length; i++,j++) {
			tmp[i] = data[j];
		}
		
		front = 0;
		rear = data.length;
		data = tmp;
		
	}

}
