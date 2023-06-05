package DpPatterns;
import java.util.*;

public class CountingTowers {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int dp[][] = new int[1000000][2];
		countTowers(dp,1000000);
		
		int t = s.nextInt();
		while(t>0) {
			
			int n = s.nextInt();
			
			System.out.println((dp[1000000-n][0]+dp[1000000-n][1])%1000000007);
			t--;
		}
		
	
		
	}

	private static void countTowers(int dp[][],int n) {
		
		
		
		dp[n-1][0] = 1;
		dp[n-1][1] = 1;
		
		int mod = 1000000007;
		
		
		for(int i=n-2; i>=0; i--) {
			
			int op1 = (dp[i+1][0] + dp[i+1][1])%mod;
			int op2 = dp[i+1][0];
			int op3 = (2*(dp[i+1][0]))%mod;
			int op4 = dp[i+1][1];
			
			dp[i][0] = ((op1+op2)%mod+op3)%mod;
			dp[i][1] = (op4 + op1)%mod;
		}
		
	}


	

}
