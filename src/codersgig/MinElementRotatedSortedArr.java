package codersgig;

public class MinElementRotatedSortedArr {

	public static void main(String[] args) {
		//3,3,5,5,7,7,11,12,38,38,39,49,55
		//4,5,6,7,8,1,2,3
		//4,5,6,7,0,1,4
		int []arr  = {2,2,2,0,1};
				
		System.out.println(getMin(arr));

	}

	private static int getMin(int[] arr) {
		
		int i=0;
		int j=arr.length-1;
		int min = Integer.MAX_VALUE;
		while(i<=j) {
			
			int mid = (i+(j-i)/2);
			
			
			if(arr[mid]>= arr[i]) {
				
				min = Math.min(min, arr[i]);
				i=mid+1;
				
			}
			
			if(arr[mid]<=arr[j]) {
				min = Math.min(min, arr[j]);
				j=mid-1;
			}
			
			min = Math.min(min,arr[mid]);
		}
		
		return min;
		
	}

}
