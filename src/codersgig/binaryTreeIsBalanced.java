package codersgig;
import java.util.*;

class binaryTree {
	
	int data;
	binaryTree left;
	binaryTree right;
	
	public binaryTree(int data) {
		this.data = data;
	}

}

class info{
	int height;
	boolean isBalanced;
	
	public info(int height,boolean isBalanced) {
		this.height = height;
		this.isBalanced = isBalanced;
	}
}


public class binaryTreeIsBalanced {

	public static void main(String[] args) {
		
		//test Case
		binaryTree root = new binaryTree(2);
		root.left = new binaryTree(3);
		root.right = new binaryTree(6);
		root.left.left = new binaryTree(4);
		root.left.right = new binaryTree(5);
		root.right.left = new binaryTree(7);
		root.right.right = new binaryTree(8);
		
		//ans
		info ans = isBalanced(root);
		System.out.println();
		
		System.out.println(ans.isBalanced);
	}

	private static info isBalanced(binaryTree root) {
		
		if(root==null) {
			return new info(Integer.MIN_VALUE,true);
		}
		
		int height;	
		boolean isBalanced;
		
		info left = isBalanced(root.left);
		info right = isBalanced(root.right);
		
		if(!left.isBalanced || !right.isBalanced || Math.abs(left.height-right.height)>=2) {
			isBalanced = false;
			height = Integer.MIN_VALUE;
		}else {
			
			height = 1+Math.max(left.height, right.height);
			isBalanced = true;
		}
		
		return new info(height,isBalanced);
	}

}
