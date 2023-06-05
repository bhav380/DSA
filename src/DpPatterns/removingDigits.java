package DpPatterns;
import java.util.*;

public class removingDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int ans = countMinSteps(n);
		System.out.println(ans);
		

	}

	private static int countMinSteps(int n) {
		
		int[] dp = new int[n+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i=1; i<=n; i++) {
			
			int num = i;
			while(num>0) {
				int rem = num%10;
				dp[i] = Math.min(dp[i-rem],dp[i]);
				num/=10;
			}
			dp[i]++;
		}
		
		return dp[n];
	}

}
