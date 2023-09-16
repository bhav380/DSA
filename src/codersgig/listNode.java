package codersgig;
import java.util.*;

public class listNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<LinkedList<Integer>> input = new ArrayList<>();	
		LinkedList<Integer> list= new LinkedList<>();
		
		//test case 1
		Integer[] arr1 = {1,4,5};
		Collections.addAll(list, arr1);
		input.add(list);
		
		
		list = new LinkedList<>();	
		Integer[]arr2 = {1,3,4};
		Collections.addAll(list, arr2);
		input.add(list);
		
		list = new LinkedList<>();
		Integer[]arr3 = {2,6};
		Collections.addAll(list, arr3);
		input.add(list);
	
		
	  //test case 2	
      //input.add(list);
		
		//test case 3
		//comment test case1 and test case2 and run
			
		String output = listNode(input,0,"");
		System.out.println(output);
	}

	private static String listNode(ArrayList<LinkedList<Integer>> input,int index,String output) {
		
		if(index==input.size()) {	
			return output+"None";
		}
	
		return listNode(input,index+1,output+"ListNode (val = "+input.get(index)+", next = {")+"})";
	
	}

}
