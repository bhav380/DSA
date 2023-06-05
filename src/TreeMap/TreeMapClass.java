package TreeMap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;



public class TreeMapClass<T extends Comparable<T>> {
	

	private  BinaryTree<T> root;
	private int size;
	private T data;
	
	
	public void insert(T data) {
		
		this.data = data;
		if(root==null) {
			root = new  BinaryTree<T>(data);
			root.count = 1;
		}else {
			
			BinaryTree<T> tmp = root;
			
			while(tmp!=null) {
				
				
				if(tmp.data.compareTo(data)<=0) {
					
					if(tmp.right==null) {
						 BinaryTree<T> node = new  BinaryTree<T>(data);
						tmp.right = node;
						node.count=1;
						break;
					}
					
					
					tmp = tmp.right;
				
				}else {
					
					if(tmp.left==null) {
						 BinaryTree<T> node = new  BinaryTree<T>(data);
						tmp.left = node;
						node.count=1;
						break;
					}
					
					tmp = tmp.left;	
				}	
			}	
			
		}
		
		size++;
	}
	
	public int size() {
		return size;
	}
	
	
	
	public void printTree() {
		
		Queue< BinaryTree<T>> watch = new LinkedList< BinaryTree<T>>();
		watch.add(root);
	
		
		while(!watch.isEmpty()) {
			 BinaryTree<T> node = watch.remove();
			
			
			System.out.print(node.data+" : "+" frequency = "+ node.count+" , ");
			
			
			
			if(node.left!=null) {
				
				System.out.print("L"+node.left.data+",");
				watch.add(node.left);
			}

           if(node.right!=null) {
				
				System.out.print("R"+node.right.data);
				watch.add(node.right);
			}
           System.out.println();

	    }	
	}
	
	private BinaryTree<T> helperDelete(BinaryTree<T> root,T data) {
		
		if(root==null){
			return null;
		}

		if(root.data == data){

			if(root.left!=null && root.right!=null){

				BinaryTree<T> tmp = root.right;
				while(tmp.left!=null){
				
					tmp=tmp.left;
				}

				root.data = tmp.data;

				root.right = helperDelete(root.right,tmp.data);
				
				return root;
			}else if(root.right!=null){

				return root.right;

			}else{

				return root.left;

			}
		}

		if(root.data.compareTo(data)<0){
			root.right = helperDelete(root.right,data);
		}else if(root.data.compareTo( data)>0){
			root.left = helperDelete(root.left,data);
		}

		return root;
	}
	
	public boolean delete(T data) {
		
		BinaryTree<T> node = helperDelete(root,data);
		if(node==null) {
			return false;
		}
		return true;
		
	}
	
	private BinaryTree<T> helperSearch(BinaryTree<T> root, T data) {
		
		if(root == null) {
			return null;
		}
		
		if(root.data.equals(data)) {
			return root;
		}
		
		if(root.data.compareTo(data)<0) {
			return helperSearch(root.right,data);
			
		}
		
		return helperSearch(root.left,data);
		
	}
	public BinaryTree<T> search(T data) {
		
		return helperSearch(root,data);
	}
	

}
