package codersgig;

public class median {
	
	
	public static double findMedian(int[]arr1,int arr2[]) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		int merged[] = new int[n+m];
		int i=0,j=0,k=0;
		
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				merged[k++]= arr1[i++];
			}else {
				merged[k++] = arr2[j++];
			}
		}
		
		while(i<n) {
			merged[k++] = arr1[i++];
		}
		
		while(j<m) {
			merged[k++] = arr2[j++];
		}
		
		
		int len = n+m;
		double median = 0;
		if(len%2==0) {
			
			median = (double)(merged[(len/2)-1]+merged[(len/2)])/2;
		}else {
			median = (double)(merged[(len/2)])/2;
		}
		
		return median;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {};
		int arr2[] = {};
		
		System.out.println(findMedian(arr1,arr2));

	}

}
