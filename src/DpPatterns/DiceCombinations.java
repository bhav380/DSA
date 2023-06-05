package DpPatterns;
import java.util.*;

public class DiceCombinations {

	
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			int n = s.nextInt();
			
			DiceCombinationsSumN(n);
			
	
		}

	private static void DiceCombinationsSumN(int n) {
		
		long dp[] = new long[n+1];
		
		dp[1] = 1;	
		
		for(int i=2; i<=n; i++) {
				
			if(i>7) {
				dp[i]=(2*dp[i-1]-dp[i-7])%1000000007;
			}else if(i==7) {
				dp[i] = (2*dp[i-1]-1);
			}else {
				dp[i] = (2*dp[i-1]);
			}
				
		}
		if(dp[n]<0) {
			System.out.println(1000000007+dp[n]);
		}else
	    	System.out.println(dp[n]);
	}
}

//
//long x = 1;
//
//long m = 0;
//
//for(int i=2,k=1; i<=n; i++) {
//	
//	if(i>7) {
//		m = (m+dp[k++])%1000000007;
//		dp[i]= (x-m)%1000000007;
//		x = (x+dp[i])%1000000007;
//	}else if(i==7) {
//		dp[i] = x;
//		x += dp[i];
//	}else {
//		dp[i] = x+1;
//		x+=dp[i];
//	}
//}
