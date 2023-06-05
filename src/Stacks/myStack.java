package Stacks;

public class myStack {
	
	private int[] arr;
	private int top;
	
	public myStack(){
		arr = new int[5];
		
	}
	
	public myStack(int size) {
		arr = new int[size];
	}
	
	public void push(int data) {
		if(top==arr.length) {
			doubleCapacity();
		}
		arr[top++] = data;
	}
	
	
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		
		int data = arr[top-1];
		top--;
		return data;
		
	}
	
	public int top() throws StackEmptyException{
		
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		return arr[top-1];
		
	}
	
	public boolean isEmpty() {
		if(top==0) {
			return true;
		}
		return false;
	}
	
	private void doubleCapacity() {
		
		int[] tmp = new int[top*2];
		for(int i=0; i<top; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
	}

}
