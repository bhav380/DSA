package codersgig;
import java.util.*;

public class pairSum {

	public static void main(String[] args) {
		
		int arr[] = {10,12,10,15,-1,7,6,5,4,2,1,1,1};
		int sum = 0;
		System.out.println(countPairSum(arr,sum));
	}

	private static int countPairSum(int[] arr, int sum) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		Set<Integer> keys = map.keySet();
		int count = 0;
		
		for(Integer key : keys) {
			
			if(key==sum-key) {
				count+= (map.get(key)*(map.get(key)-1))/2;
				map.put(key,0);
				
			}else if(map.containsKey(sum-key)) {
				
				count += map.get(key)*map.get(sum-key);
				map.put(key,0);
				map.put(sum-key,0);
			}
		}
		
		return count;	
	}
}
