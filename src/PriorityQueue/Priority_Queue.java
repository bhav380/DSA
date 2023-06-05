package PriorityQueue;
import java.util.ArrayList;

public class Priority_Queue<T> {
	
	private ArrayList<Element<T>> heap;
	
	public Priority_Queue() {
		heap = new ArrayList<>();
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public T getMin() throws HeapEmptyException {
		if(size()==0) {
			throw new HeapEmptyException();
		}
		
		return heap.get(0).value;
	}
	
	public void insert(T value,int priority) {
		
		Element<T> data = new Element<>(value,priority);
		
		heap.add(data);
		int index = size()-1;
		
		int parentIndex = (index-1)/2;
		Element<T> parent = heap.get(parentIndex);
		Element<T> tmp = data;
		
		while(data.priority<parent.priority && index!=0) {
			
			tmp = parent;
			heap.set(parentIndex,data);
			heap.set(index,tmp);
			
			
			
			index = parentIndex;
			parentIndex = (index-1)/2;
			parent = heap.get(parentIndex);
			
		}
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		
		for(Element data : heap) {
			System.out.print("Value : "+data.value + " Priority : "+ data.priority+ " ,,,");
		}
		
		System.out.println();
	}
	
	
	
	
	
	

}
