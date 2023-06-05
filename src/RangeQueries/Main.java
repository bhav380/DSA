package RangeQueries;
//package RangeQueries;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		
		int arr[] = new int[n];
		long prefixSum[] = new long[n+1];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
			prefixSum[i+1] = arr[i]+prefixSum[i];
		}
		long dp[][] = new long[n+1][n+1];
		
		setDp(dp,prefixSum,1);
		
//		for(long elem : prefixSum) {
//			System.out.print(elem+" ");
//		}
//		
//		System.out.println("\n");
//		
		
//		for(int i=0; i<=n;i++) {
//			for(int j=0; j<=n; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}

  	for(int i=0; i<q; i++) {
			int option = s.nextInt();
			
			if(option==1) {
				int k = s.nextInt();
				int u = s.nextInt();	
				for(int j=k; j<=n; j++) {
					prefixSum[j] = prefixSum[j] - arr[k-1] + u;
				}
				arr[k-1] = u;
				setDp(dp,prefixSum,k);
//				for(int t=0; t<=n;t++) {
//					for(int j=0; j<=n; j++) {
//						System.out.print(dp[t][j]+" ");
//					}
//					System.out.println();
//				}
			}else {
				//System.out.println("hi");
				int a = s.nextInt();
				int b = s.nextInt();
				long maxPrefix = dp[a][b]-prefixSum[a-1];
				
				System.out.println(maxPrefix<0?0:maxPrefix);
			}
		}
		
		

	}
	
	private static void helper(long[][] dp,long [] prefixSum,int i,int row,long max) {
		
		int n = prefixSum.length;
		
		dp[1][i] = max;
		
		for(int j=i+1; j<n; j++) {
			
			if(max<prefixSum[j]) {
				max = prefixSum[j];
			}
			
			
			dp[row][j] = max;
		
		}
		
	}

	private static void setDp(long[][] dp, long[] prefixSum,int i) {
		
		int n = prefixSum.length;
		
		long max = Integer.MIN_VALUE;
		for(int j=1; j<n; j++) {
			if(max<prefixSum[j]) {
				max=prefixSum[j];
			}
			
			for(int k=1; k<n; k++) {
				dp[k][j] = max;
			}
			
		}
		for(int k=2; k<n;  k++) {
			
			
			if(dp[k-1][k-1]>prefixSum[k]) {
				max = prefixSum[k];
				helper(dp,prefixSum,k,k,max);	
			}
		}
	}

}





//8 2
//1 2 -1 3 1 -5 1 4