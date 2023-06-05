package DpPatterns;

import java.util.Scanner;

public class coinCombinations2 {

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

	private static int coinCombinations(int[] coins, int x) {
		int [] dp = new int[x+1];
		
		dp[0] = 1;
		
		for(int i=0; i<coins.length; i++) {
			for(int j=1; j<=x; j++) {
				if(j>=coins[i]) {
					dp[j] = dp[j]+dp[j-coins[i]]; 
				}
			}
		}
		
		return dp[x];
	}

}
