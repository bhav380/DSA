package codersgig;
import java.util.*;

public class majorityElement {

	public static void main(String[] args) {
		int nums[] = {2,2,1,1,1,2,2};
		
		System.out.println(getMajorityElement(nums));

	}

	private static int getMajorityElement(int[] nums) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		int n = nums.length;
		
		for(int i=0; i<n; i++) {
			
			int count = 0;
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				count = map.get(nums[i]);
				map.put(nums[i],count+1);
				count++;
			}
			
			if(count>n/2) {
				return nums[i];
			}
		}
		
		return -1; // there is no majority element
			
	}

}
