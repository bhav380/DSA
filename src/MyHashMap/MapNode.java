package MyHashMap;

public class MapNode<T1,T2> {
	
	public T1 key;
    public T2 value;
	MapNode<T1,T2> next;
	
	public MapNode(T1 key,T2 value) {
		this.key = key;
		this.value = value;
	}

}
