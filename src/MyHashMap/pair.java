package MyHashMap;

public class pair<T1,T2> {
	T2 value;
	MapNode<T1,T2> node;
	
	public pair(T2 value,MapNode<T1,T2> node) {
		this.value = value;
		this.node = node;
		
	}

}
