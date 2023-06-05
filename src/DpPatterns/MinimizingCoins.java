package DpPatterns;
import java.util.*;
public class MinimizingCoins {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int x= s.nextInt();
		
		int coins[] = new int[n];
		for(int  i=0; i<n; i++) {
			coins[i] = s.nextInt();
		}
//		int dp[] = new int[x+1];
//	
		
		int ans = minimizeCoins(coins,x);
		System.out.println(ans);
		
		
		

	}
	
	public static int minimizeCoins(int[] coins, int x) {
		
		int n = coins.length;
		
		int dp[] = new int[x+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		
		dp[0] = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<=x; j++) {
				if(j>=coins[i] && dp[j-coins[i]]!=Integer.MAX_VALUE) {
					dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
				}
			}
		}
		
		return dp[x]==Integer.MAX_VALUE?-1:dp[x];
	
	}

	private static int minimizeCoins(int[] coins, int[] dp,int x,int index) {
		if(x==0) {
			return 0;
		}
		if(x<0) {
			return -1;
		}
		
		int ans = Integer.MAX_VALUE ;
		if(dp[x]!=Integer.MAX_VALUE) {
			return dp[x];
		}
		for(int i=index; i<coins.length; i++) {
			
			int minCoins = minimizeCoins(coins,dp,x-coins[i],i);
			if(minCoins==-1) {
				continue;
			}
			ans = Math.min(minCoins, ans);
		}
		
		if(ans==Integer.MAX_VALUE) {
			return -1;
		}
		
		dp[x] = ans+1;
		return dp[x];
	}

}
//28 1000
//695 713 878 614 109 164 387 3 287 823 485 716 556 323 924 57 35 705 643 77 200 944 768 490 589 339 701 190
