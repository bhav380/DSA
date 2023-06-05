package LinkedList;

import java.util.Scanner;

public class UseLinkedList {
	
	 public static Node<Integer> reverse( Node<Integer> head){

		 Node<Integer> cur=head;
		 Node<Integer> next=head;
		 Node<Integer> prev = null;

	        while(next!=null){
	        	System.out.print("hello");
	            cur = next;
	            next = cur.next;
	            cur.next = prev;
	            prev = cur;
	        }

	        return cur;
	    }

	
	public static Node<Integer> createLinkedList(){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 1st element of Linked list (enter -1 to exit) : ");
		Integer data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tmp=head;
		
		int i=2;
		
		
		while(data!=-1) {
			if(head==null) {
				
				head = new Node<Integer>(data);
				tmp = head;	
			}else {
				tmp.next = new Node<Integer>(data);
				tmp = tmp.next;
			}
			
			System.out.print("Enter "+i+"th element of Linked list (enter -1 to exit) : ");
			i++;
			
			data = s.nextInt();
		}
		
		return head;
		
	}
	
	public static void printLinkedList(Node<Integer> node) {
		
		Node<Integer> tmp = node;
		
		while(tmp!=null) {
			
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
			
		}
		
		System.out.println();
		
	}
	
	public static Node<Integer> insertRecursive(Node<Integer> head,int data,int pos){
		
		if(head==null && pos>0) {
			return head;
		}
		
		if(pos == 0) {
			Node<Integer> insertedNode = new Node<Integer>(data);
			insertedNode.next = head;
			return insertedNode;
		}
		
		head.next = insertRecursive(head.next,data,pos-1);
		
		return head;
		
	}
	
	public static Node<Integer> deleteRecursive(Node<Integer> head,int pos){
		
		if(head==null) {
			return head;
		}
		
		if(pos==0) {
			return head.next;
		}
		
		head.next = deleteRecursive(head.next,pos-1);
		return head;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = createLinkedList();
		printLinkedList(head);
		head = reverse(head);
		printLinkedList(head);
		
		
		
//		head = insertRecursive(head,10,5);
		head = deleteRecursive(head,5);
		printLinkedList(head);
		
		
		

	}

}
