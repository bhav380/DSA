package Trees.binaryTree;

public class UseBSTClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTClass save = new BSTClass();
		
		save.insert(18);
		save.insert(13);
		save.insert(223);
		save.insert(-3);
		save.insert(83);
		save.insert(3);
		save.insert(-199);
		
		save.insert(333);
		save.insert(225);
		save.insert(33333);
		save.insert(113);
		save.insert(93);
		save.insert(183);
		
		
		save.printTree();
		System.out.println(save.size());
		
		
		save.delete(18);
		save.printTree();
		System.out.println(save.size());
		
		
		
		
		

	}

}
