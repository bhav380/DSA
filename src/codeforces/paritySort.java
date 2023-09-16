//package codeforces;
import java.util.*;

public class paritySort {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		int t = s.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = s.nextInt();
			
			int arr[] = new int[n];
			
			for(int j=0; j<n; j++) {
				arr[j] = s.nextInt();
			}
			
			isIncreasing(arr,n);
			
			
			
		}
		
	}

	private static void isIncreasing(int[] arr,int n) {
		
		
	
		int tmp[] = new int[n];
		
		for(int i=0; i<n; i++) {
			tmp[i] = arr[i];
			
		}
		
		Arrays.sort(tmp);
		
		for(int i=0; i<n; i++) {
			if(tmp[i]%2==0) {
				
				if(arr[i]%2!=0) {
					System.out.println("NO");
					return;
				}
			}else if(tmp[i]%2!=0) {
				if(arr[i]%2==0) {		
					System.out.println("NO");
					return;		
				}
			}
		}
		
		
		System.out.println("Yes");
		
		
	}

}
