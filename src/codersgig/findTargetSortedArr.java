package codersgig;

public class findTargetSortedArr {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,5,5,7,8};
		
		int target = 4;
		
		System.out.println(isPresent(arr,target));
		

	}

	private static int isPresent(int[] arr, int target) {
		
		int low = 0;
		int up = arr.length-1;
		
		while(low<=up) {
			
			int mid = low + (up-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				up = mid-1;
			}
		}
		
		return low;	
	}

}
