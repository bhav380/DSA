package Stacks;
import java.util.*;

public class UseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myStack s = new myStack();
		
		try {
			
			s.push(50);
			
			s.pop();
			s.top();
			
			System.out.println(s.top());
			
			
		}catch(StackEmptyException e) {
			System.out.println(e);
		}finally {
			System.out.println("done");
		}
		
		
		Stack<Integer> t = new Stack<>();
		
		int[] arr = {1,3,5,63,56};
		
		for(int elem : arr) {
			t.push(elem);
		}
		
		while(!t.isEmpty()) {
			System.out.println(t.pop());
		}
		
		
		
		
		
	

	}

}
