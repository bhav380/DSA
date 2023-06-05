package HashMap;
import java.util.HashMap;
import java.util.Set;

public class UseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		HashMap<Integer[],Integer> m = new HashMap<>();
		
		Integer[] key1 = {1,3,2,2,1};
		Integer[] key2 = {84,2,5,6,38,656,33};
		Integer[] key3 = {2};
		
		m.put(key1, 1000);
		m.put(key2, 88);
		m.put(key1, null);
		
		
		
		
		System.out.println(key1);
		
		Integer[] key4 = {1,3,2,2,1};
		System.out.println(m.get(key4));
		
		map.put("abc",38);
		map.put("abc",99);
		map.put("def",388);
		map.put("hello",22);
		map.put("hello",map.get("hello")+1);
		
		if(map.containsKey("abc")) {
			System.out.println("abc is present");
		}
		
		if(map.containsKey("bb")) {
			;
		}else {
			System.out.println("bb not present");
		}
		
		if(map.containsKey("hello")) {
			System.out.println("Value of hello is : "+map.get("hello"));
		}
		
		if(map.containsValue(22)) {
			System.out.println("22 is present");
			
		}
		
		map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.println("abc is present");
		}else {
			System.out.println("abc is not present");
		}
		
		Set<String> s = map.keySet();
		
		for(String key : s) {
			System.out.println(key);
		}
		

	}

}
