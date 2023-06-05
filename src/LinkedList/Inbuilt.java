package LinkedList;
import java.util.LinkedList;

public class Inbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(88);
		list.add(99);
		list.add(38);
		list.add(44);
		list.add(3);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		
		list2.add(88);
		list2.add(99);
		list2.add(38);
		list2.add(44);
		list2.add(3);
	
		Integer arr[] = list2.toArray(new Integer[0]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		if(list.equals(list2)) {
			System.out.println("We are equal");
		}else {
			System.out.println("We are unequal");
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		
		

	}

}
