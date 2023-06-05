package genericTree;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class UseGenericTree {
	
	public static int numberOfNodes(GenericTree root) {
		if(root==null) {
			return 0;
		}
		
		int n = root.children.size();
		int count =0;
		
		for(int i=0; i<n; i++) {
			count += numberOfNodes(root.children.get(i));
		}
		
		return 1+count;
		
		
	}
	
	public static GenericTree createRecursive(GenericTree root) {
		
		   Scanner s = new Scanner(System.in);
		   int data ; 
		   if(root==null) {
			   System.out.print("Enter node data : ");
			   data = s.nextInt();
			   root = new GenericTree(data);
			   
		   }
		
		   System.out.print("Enter number of children of "+root.data+" : " );
		   int n = s.nextInt();
		   root.children = new ArrayList<GenericTree>();
		   
		   for(int i=0; i<n; i++) {
			   GenericTree child = null;
			   
			   root.children.add(createRecursive(child));
		   }
		   
		   return root;	
		
	}
	
	public static GenericTree createGenericTree() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data (-1 for null tree): ");
		int data = s.nextInt();
		
		if(data==-1) {
			return null;
		}
		
		GenericTree root = new GenericTree(data);
		
		Queue<GenericTree> waitList = new LinkedList<GenericTree>();
		
		waitList.add(root);
		while(!waitList.isEmpty()) {
			
			GenericTree node = waitList.remove();
			
			System.out.print("Enter number of children of  "+node.data+" (0 if no child) : ");
			int n= s.nextInt();
			node.children = new ArrayList<GenericTree>();
			
			for(int i=0; i<n; i++) {
				System.out.print("Enter child "+(i+1)+" : ");
				data = s.nextInt();
				GenericTree insert = new GenericTree(data);
				waitList.add(insert);
				node.children.add(insert);
			}
		}
		
		return root;
	}
	
	
	
	public static void print(GenericTree root) {
		
		
        Queue<GenericTree> waitList = new LinkedList<GenericTree>();
		
		waitList.add(root);
		
		while(!waitList.isEmpty()) {
			
			GenericTree node = waitList.remove();
			
			System.out.print(node.data+" : ");
			int n = node.children.size();
			
			for(int i=0; i<n; i++) {
				GenericTree child = node.children.get(i);
				System.out.print(child.data+" ");
				waitList.add(child);
			}
			System.out.println();
		}
		
	}
	
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		GenericTree root = createGenericTree();
//		print(root);
//		System.out.println(numberOfNodes(root));
		
		GenericTree root2 = null;
		root2 = createRecursive(root2);
		print(root2);
	}

}
