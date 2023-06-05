package TreeMap;

public class hashMapUsingTreeMap<T extends Comparable<T>> {
	
	private TreeMapClass<T> storage;
	
	public hashMapUsingTreeMap() {
		storage = new TreeMapClass<T>();
	}
	
	public void insert(T data) {
		
		BinaryTree<T> node = storage.search(data);
		if(node==null) {
			storage.insert(data);
		}else{
			node.count++;
		}	
	}
	
	public int frequency(T data) {
		BinaryTree<T> node  = storage.search(data);
		if(node==null) {
			return 0;
		}
		return node.count;
	}
	
	public boolean deleteKey(T data) {
		
		return storage.delete(data);	
	}
	
	public boolean deleteOccurence(T data) {
		BinaryTree<T> node = storage.search(data);
		
		if(node!=null) {
			node.count--;
			return true;
		}
		
		return false;
		
	}
	
	public void print() {
		storage.printTree();
	}
	
}
