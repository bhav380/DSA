package TreeMap;

public class hashMapUsingTreMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 hashMapUsingTreeMap<Integer> myMap = new  hashMapUsingTreeMap<>();
		 
		 myMap.insert(33);
		 myMap.insert(3883);
		 myMap.insert(3838);
		 myMap.insert(1);
		 myMap.insert(-1);
		 myMap.insert(1);
		 myMap.insert(33);
		 myMap.insert(0);
		 myMap.insert(1000000);
		 myMap.insert(-1000000);
		 myMap.insert(0);
		 myMap.insert(33);
		 myMap.insert(33);
		 myMap.insert(1);
		 myMap.insert(88);
		 
		 myMap.print();
		 
		 myMap.deleteOccurence(33);
		 myMap.deleteOccurence(33);
		 myMap.deleteKey(1);
		 myMap.deleteKey(3883);
		 
		 myMap.print();
		 
		 
		 
		 

	}

}
