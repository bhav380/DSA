package DpPatterns;
import java.util.*;

public class MoneySum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int coins[] = new int[n];
		for(int i=0; i<n; i++) {
			coins[i] = s.nextInt();
		}
		
		moneySums(coins,n);
	}

	private static void moneySums(int[] coins, int n) {
		
		int sum = 0;
		for(int i=0; i<coins.length; i++) {
			sum+=coins[i];
		}
		

		
		int dp[][] = new int[n][sum+1];
		dp[0][coins[0]] = 1;
		
		int count = 1;
		
		for(int i=1; i<n; i++) {
			
			count = count + (dp[i-1][coins[i]]^1);
			dp[i][coins[i]] = 1;
			
	
			for(int j=1; j<=sum; j++) {
				
				if(dp[i-1][j]==1) {
					dp[i][j] = 1;
					if(dp[i-1][j+coins[i]]!=1) {
						dp[i][j+coins[i]] = 1;	
						//System.out.println(count);				
						count++;
						
					}
					
				}
			}
		}
		
		System.out.println(count);
		for(int j=1; j<=sum; j++) {
			if(dp[n-1][j]==1)
			     System.out.print(j+" ");
		}
		
		
		
	}

}
