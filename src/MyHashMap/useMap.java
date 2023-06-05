package MyHashMap;

public class useMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> m = new Map<String,Integer>();
		
		for(int i=0; i<10; i++) {
			int a = i+1;
			String s = a+"abc";
			m.insert(s, i+1);
			System.out.println(m.getValue(s)+" load factor : "+ m.loadFactor());
		}
		
		for(int i=2; i<30; i=i+2) {
		    long a = i*i;
			m.insert(a+"dei", i);
		}
		
		for(int i=50; i<100; i=i+2) {
			long a = i*i;
			m.insert(a+"kdieiek", i);
		}
		
		for(int i=1000; i<1200; i=i+10) {
			long a =i*i*i;
			m.insert(a+"zzjuenfh", i+38);
		}
		
		
		m.insert("hello",383);

		m.printMap();
		
		System.out.println(m.size());
		
		
	
		
		
		
		
		

	}

}
