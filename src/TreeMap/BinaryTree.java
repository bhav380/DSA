package TreeMap;

public class BinaryTree<T extends Comparable<T> > {
	
	T data;
	BinaryTree left;
    BinaryTree right;
    int count;
	
	public BinaryTree(T data) {
		this.data = data;
	}

}
