package MyHashMap;
import java.util.ArrayList;

public class Map<T1,T2> {
	
	private ArrayList<MapNode<T1,T2>> map = new ArrayList<>();
	private int size;
	private int count;
	
	public Map() {
		size = 5;
		map = new ArrayList<>(size);
		for(int i=0; i<size; i++) {
			map.add(null);
		}
	}
	
	private int helperHashCode(String key) {
		

		int baseP = 37;
		int power = 0;
		int hashCode=0;
		
		for(int i=key.length()-1; i>=0; i--) {
			hashCode+= (int)(key.charAt(i)) * (int)Math.pow(baseP,power); 	
		}
		
		hashCode = hashCode%size;
		
		return hashCode;	
	}
	
	
	
	
	public int hashCode(T1 key) {
		
       int hashCode=0;
		
		
	    String type = ((Object)key).getClass().getSimpleName();
		
		if(type.equals("Integer")||type.equals("Character")) {
			
			hashCode = (int)key;
			hashCode = hashCode%20;
	
		}else if(type.equals("String")) {
	
			String s = (String)key;
			hashCode = helperHashCode(s);
			
		}
		return hashCode;
	
	}
	
	public boolean search(T1 key){
		
       int hashCode=hashCode(key);
		
	    MapNode<T1,T2> node = map.get(hashCode);
	    	
	     while(node!=null && node.key!=key) {
	    		node=node.next;
	     } 
	     
	    if(node!=null) {
	    	return true;
	    }
	    
	    return false;    	
	}
	
	public double loadFactor() {
		return (1.0*count)/size;
	}
	
	
	
	public void insert(T1 key,T2 value) {
		
//		int hashCode = 1;
		
		int hashCode=hashCode(key);
		
		
	    MapNode<T1,T2> node = map.get(hashCode);
	   
	    while(node!=null) {
	    	
	    	if(node.key.equals(key)) {
	    		node.value = value;
	    		return;
	    	}
	    	node=node.next;
	    }
	    
	    node = map.get(hashCode);

	      
	    MapNode<T1,T2> newNode = new MapNode<>(key,value);
	    newNode.next = node;
	    map.set(hashCode,newNode);   
	    count++;
	    
	   
	      
	   
	      
	    if(loadFactor()>0.75) {
	    	rehash();
	    }
	   
	      
	}
	
	private void rehash() {
		// TODO Auto-generated method stub
		
		ArrayList<MapNode<T1,T2>> tmp = map;
		
		map = new ArrayList<>();
		
		
 		size=size*2;
		for(int i=0; i<size; i++) {
			map.add(null);
		}
		count=0;
		for(int i=0; i<size/2; i++) {
			MapNode<T1,T2> head = tmp.get(i);
			while(head!=null) {
				insert(head.key,head.value);
				head=head.next;
			}
		}	
	}

	public T2 getValue(T1 key) {
		
//		int hashCode = 1;
		
		int hashCode = hashCode(key);
		
		MapNode<T1,T2> node = map.get(hashCode);
		
		while(node!=null && !node.key.equals(key)) {
			node = node.next;
		}
		
		if(node!=null) {
			return node.value; 
		}
		
		return null;
		
	}
	
	private pair helperDeleteNode(T1 key,MapNode<T1,T2> node) {
		if(node==null) {
			return new pair(null,null);
		}
		
		if(node.key.equals(key)) {
			count--;
			return new pair(node.value,node.next);
		}
		
		pair smallOutput = helperDeleteNode(key,node.next);
		
		
		if(smallOutput.value!=null) {
			node.next = smallOutput.node;
		}
		
		smallOutput.node = node;
		
		return smallOutput;
		
	}
	
	private void printChain(MapNode<T1,T2> node) {
		
		while(node!=null) {
			System.out.print(node.key + " : " + node.value+" ,,,,,");
			node = node.next;
		}
	}
	
	public void printMap() {
		
		for(int i=0; i<size; i++) {
			printChain(map.get(i));
			System.out.println();
		}
		
	}
	
	public T2 deleteKey(T1 key) {
		//int hashCode = 1;
		int hashCode = hashCode(key);
		
		MapNode<T1,T2> node = map.get(hashCode);
		
		
		pair<T1,T2> ans = helperDeleteNode(key,node);
		
		if(ans.value!=null) {	
	    	map.set(hashCode, ans.node);
		}
			
		return ans.value;
	}
	
	public int size() {
		return count;
	}

}
