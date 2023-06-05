package RangeQueries;
import java.util.*;

public class PrefixSumRange {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		
		int arr[] = new int[n];
		int prefixSum[] = new int[n+1];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
			prefixSum[i+1] = arr[i]+prefixSum[i];
		}
		
		
		
		
		for(int i=0; i<q; i++) {
			int option = s.nextInt();
			if(option==1) {
				int k = s.nextInt();
				int u = s.nextInt();
				
				
				for(int j=k; j<=n; j++) {
					prefixSum[j] = prefixSum[j] - arr[k-1] + u;
				}
				arr[k-1] = u;
			}else {
				//System.out.println("hi");
				
				int a = s.nextInt();
				int b = s.nextInt();
				
				int maxPrefix = Integer.MIN_VALUE;
				for(int j=a; j<b; j++) {
					int prefix = prefixSum[j]-prefixSum[a-1];
					if(maxPrefix<prefix) {
						maxPrefix = prefix;
					}
				}
				
				
				System.out.println(maxPrefix);
				
			}
		}
		
		

	}

}
