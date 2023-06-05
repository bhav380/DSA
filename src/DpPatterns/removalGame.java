package DpPatterns;
import java.util.*;
public class removalGame {
	
	


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		removalGame(arr,n);
		
	}

	private static void removalGame(int[] arr, int n) {
		
		int dp[][] = new int[n][n];
		
		int sum = 0;
		
		for(int i=n-1; i>=0; i--) {
			dp[i][i] = arr[i];
			sum+=arr[i];
			for(int j=i+1; j<n; j++) {
				dp[i][j] = Math.max(arr[i]-dp[i+1][j],arr[j]-dp[i][j-1]);
			}
		}
		
		System.out.println((sum+dp[0][n-1])/2);
	}

}
