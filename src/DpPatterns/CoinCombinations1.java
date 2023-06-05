package DpPatterns;
import java.util.Arrays;
import java.util.Scanner;

public class CoinCombinations1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int x = s.nextInt();
		
		int[] coins = new int[n];
		for(int i=0; i<n; i++) {
			coins[i] = s.nextInt();
		}
		
		int ans = coinCombinations(coins,x);
		
		System.out.println(ans);
		

	}
	
	

	private static int coinCombinations(int[] coins, int x, int[] dp) {
		if(x==0) {
			return 1;
		}
		if(x<0) {
			return 0;
		}
		
		if(dp[x]!=-1) {
			return dp[x];
		}
		
		int ans = 0;
		
		for(int i=0; i<coins.length; i++) {
			
			ans += coinCombinations(coins,x-coins[i],dp);
		}
		
		dp[x] = ans;
		return dp[x];
	}



	private static int coinCombinations(int[] coins, int x) {
		
		int[] dp = new int[x+1];
		
		dp[0] = 1;
		
		
		for(int i=1; i<=x; i++) {
			for(int j=0; j<coins.length; j++) {
				
				if(i>=coins[j]) {
					dp[i] += dp[i-coins[j]];
				}
			}
		}		
		return dp[x];	
	}

}
