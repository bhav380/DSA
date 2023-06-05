package Trees.binaryTree;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class info{
	int height;
	boolean isBalanced;
	
	public info(int height,boolean isBalanced) {
		this.height = height;
		this.isBalanced = isBalanced;
	}
}




public class UseBinaryTree {
	
	// 1 2 3 4 5 -1 -1 -1 -1 6 -1 -1 -1
	
	
	
	public static boolean checkIsBST2(BinaryTree root,int min,int max) {
		if(root==null) {
			return true;
		}
		
		if(root.data<min || root.data>max) {
			return false;
		}
		
		return checkIsBST2(root.left,min,root.data-1) && checkIsBST2(root.right,root.data,max);
		
	}
	
	public static isBST checkIsBST(BinaryTree root) {
		
		if(root==null) {
			return new isBST(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
		}
		
		isBST left = checkIsBST(root.left);
		isBST right = checkIsBST(root.right);
		
		int min = Math.min(left.min,Math.min(right.min, root.data));
		int max = Math.max(left.max, Math.max(right.max, root.data));
		boolean isBst = true;
		
		if(left.max >= root.data || right.min<root.data || !(left.isBst && right.isBst)) {
			System.out.println(root.data);
			isBst = false;
			
		}
		
		
		
		return new isBST(min,max,isBst);
		
	}
	
	public static BinaryTree pos(BinaryTree root,int data) {
		if(root==null||(root.left==null && root.right==null)) {
			return root;
		}
		
		if(root.data>data) {
		      BinaryTree ans = pos(root.left,data);
		      if(ans==null) {
		    	  return root;
		      }else {
		    	  return ans;
		      }
		}else {
			BinaryTree ans =  pos(root.right,data);
			if(ans==null) {
				return root;
			}else {
				return ans;
			}
		}
	}
	
	public static BinaryTree createBST(BinaryTree root) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter root data : ");
		int data = s.nextInt();
		
		root = new BinaryTree(data);
		
		System.out.print("Enter data : ");
		data = s.nextInt();
	
		
		
		while(data!=-1){
	
			BinaryTree leaf = pos(root,data);
			
			if(leaf.data>data) {
				leaf.left = new BinaryTree(data);
			}else {
				leaf.right = new BinaryTree(data);
			}
			
			
			
			System.out.print("Enter data : ");
			data = s.nextInt();
		}
		
		return root;	
		
	}
	
	public static info HelperIsBalanced(BinaryTree root) {
		if(root==null) {
			return new info(0,true);
		}
		
		info leftSubtree = HelperIsBalanced(root.left);
		info rightSubtree = HelperIsBalanced(root.right);
		
		info currentTree = new info(1+Math.max(leftSubtree.height,rightSubtree.height),true);
		
		
		if(!leftSubtree.isBalanced || !rightSubtree.isBalanced) {
			currentTree.isBalanced = false;
			return currentTree;
		}
		
		if(Math.abs(leftSubtree.height-rightSubtree.height)>1) {
			currentTree.isBalanced = false;
		}
		
		return currentTree;
	}
	
	public static boolean isBalanced(BinaryTree root) {
		info tree = HelperIsBalanced(root);
		
		return tree.isBalanced;
	}
	
	public static void printDepthK(BinaryTree root,int k) {
		if(root==null) {
			return;
		}
		
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		
		printDepthK(root.left,k-1);
		printDepthK(root.right,k-1);
		
	}
	
	public static boolean removeLeafNodes(BinaryTree root) {
		
		if(root==null) {
			return false;
		}
		
		if(root.left==null && root.right==null) {
			return true;
		}
		
		if(removeLeafNodes(root.left)) {
			root.left = null;
		}
		
		if(removeLeafNodes(root.right)) {
			root.right = null;
		}
		
		
		return false;
		
		
	}
	// 3 83 5 100 100000 -55
	
	public static void printTree(BinaryTree root) {
		if(root==null) {
			return;
		}
		
		System.out.println("Current node is : "+root.data);
		if(root.left!=null) {
			System.out.println("left child is : "+root.left.data);
			
		}
		
		if(root.right!=null) {
			System.out.println("Right child is : "+root.right.data);
		
		}
		
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTree createBinaryTreeLevelWise(BinaryTree root) {
		
		System.out.println("enter root node data : ");
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if(data==-1) {
			return root;
		}
		root = new BinaryTree(data);
		Queue<BinaryTree> watch = new LinkedList<BinaryTree>();
		watch.add(root);
		
		while(!watch.isEmpty()) {
			BinaryTree node = watch.remove();
			System.out.println("Current node is "+node.data);
			
			System.out.print("Enter left Child of current node (-1 for null) : ");
			int leftData = s.nextInt();
			System.out.print("Enter right Child of current node (-1 for null) : ");
			int rightData = s.nextInt();
			
			if(leftData!=-1) {
				BinaryTree leftChild = new BinaryTree(leftData);
				node.left = leftChild;
				watch.add(leftChild);
				
			}

			if(rightData!=-1) {
				BinaryTree rightChild = new BinaryTree(rightData);
				node.right = rightChild;
				watch.add(rightChild);	
			}
	    }
		
		return root;	
	}
	
	public static BinaryTree createBinaryTree(BinaryTree root) {
		
		Scanner s = new Scanner(System.in);
		if(root==null) {
			System.out.println("enter current node data : ");
			int data = s.nextInt();
			root = new BinaryTree(data);
		}
		
		System.out.println("Current node is "+root.data);
		
		System.out.print("Enter left Child of current node (-1 for null) : ");
		int leftData = s.nextInt();
		System.out.print("Enter right Child of current node (-1 for null) : ");
		int rightData = s.nextInt();
		
		if(leftData!=-1) {
			BinaryTree leftChild = new BinaryTree(leftData);
			root.left = leftChild;
			root.left = createBinaryTree(root.left);
			
		}
		if(rightData!=-1) {
			BinaryTree rightChild = new BinaryTree(rightData);
			root.right = rightChild;
			root.right = createBinaryTree(root.right);
		}
		
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = null;
		
		root = createBST(root);
		printTree(root);
		boolean ans = checkIsBST2(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(ans);
		
		root =  createBinaryTreeLevelWise(null);
		
		ans = checkIsBST2(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
//		root = createBinaryTreeLevelWise(root);
//		printTree(root);
//		printDepthK(root,3);
//		removeLeafNodes(root);
//		printTree(root);
		
//		System.out.println(isBalanced(root));
		
		
	}

}
