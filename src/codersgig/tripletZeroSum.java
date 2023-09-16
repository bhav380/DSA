package codersgig;
import java.util.*;

public class tripletZeroSum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//testcase 1 int nums[]={-1,0,1,2,-1,-4}
		
		
		int nums[] = {5,-1,4,-2,-3,8,-4,6,-2,38,2,8,-4,-1,-2,5,11,-11,-1,10,-1,-32,32,22,-22,0};
		
		ArrayList<ArrayList<Integer>> ans = tripletSumZero(nums);
		
		System.out.println(ans);

	}

	private static ArrayList<ArrayList<Integer>> tripletSumZero(int[] nums) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		HashMap<String,Boolean> uniqueTriplets = new HashMap<>();
		
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-2; i++) {
			
			int pairSum = -nums[i];
			
			for(int j=i+1,k=nums.length-1; j<k;) {
				
				int sum = nums[j]+nums[k];
				if(sum==pairSum) {
					
					String key = ""+nums[i]+""+nums[j]+""+nums[k];
					
					if(uniqueTriplets.containsKey(key)) {
						j++;
						k--;
						continue;
					}else{
						uniqueTriplets.put(key,true);
					}
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					
					ans.add(list);
					j++;
					k--;
				}else if(sum<pairSum) {
					j++;
				}else {
					k--;
				}
				
			}
		}
		
		
		return ans;
		
		
	}

}
