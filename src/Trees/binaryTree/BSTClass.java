package Trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTClass {
	
	private BinaryTree root;
	private int size;
	
	public void insert(int data) {
		
		if(root==null) {
			root = new BinaryTree(data);
		}else {
			
			BinaryTree tmp = root;
			
			while(tmp!=null) {
				
				if(tmp.data<=data) {
					
					if(tmp.right==null) {
						BinaryTree node = new BinaryTree(data);
						tmp.right = node;
						break;
					}
					
					tmp = tmp.right;
				
				}else {
					
					if(tmp.left==null) {
						BinaryTree node = new BinaryTree(data);
						tmp.left = node;
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
		
		Queue<BinaryTree> watch = new LinkedList<BinaryTree>();
		watch.add(root);
	
		
		while(!watch.isEmpty()) {
			BinaryTree node = watch.remove();
			
			
			System.out.print(node.data+" : ");
			
			
			
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
	
	private boolean helperDelete(int data,BinaryTree parent,BinaryTree root) {
		
		if(root==null) {
			return false;
		}
		
		if(root.data == data) {
			
			BinaryTree tmp = root;
			root = root.right;
			BinaryTree child = root.left;
			
			root.left = tmp.left;
			
			BinaryTree insertAt = root.left;
			
			while(insertAt.right!=null) {
				insertAt = insertAt.right;
			}
			
			insertAt.right = child;
			
			if(parent!=null) {
				
				
				if(parent.left == tmp) {

					parent.left = root;
					
				}else {
					parent.right = root;
				}	
			}else {
				this.root = root;
			}
			
			size--;
			return true;
		}
		
		boolean output;
		
		if(root.data < data) {
			
			output = helperDelete(data,root,root.right);
		}else {
			output = helperDelete(data,root,root.left);
		}
		
		
		
		return output;
	}
	
	public boolean delete(int data) {
		
		return helperDelete(data,null,root);
		
	}

}
