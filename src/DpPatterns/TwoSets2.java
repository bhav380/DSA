package DpPatterns;
import java.util.*;

public class TwoSets2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		twoSets(n);
	}

	private static void twoSets(int n) {
		
		int x = (n*(n+1))/2;
		if(x%2!=0) {
			System.out.println(0);
			return;
		}
		x/=2;
		
		int dp[][] = new int[n+1][x+1];
		for(int i=0; i<=n; i++) {
			dp[i][0]  = 1;
		}
		
		for(int i=n-1; i>=1; i--) {
			
			dp[i]=dp[i+1];
			
			for(int j=x; j>=i; j--) {	
				dp[i][j] = (dp[i][j]+dp[i+1][j-i])%1000000007;	
			}
		}

		
		System.out.println(dp[1][x]);	
	}

}
