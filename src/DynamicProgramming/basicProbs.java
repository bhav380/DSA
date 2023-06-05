package DynamicProgramming;

public class basicProbs {
	
	public static long fib(int n,long dp[]) {
		
		if(n==0 || n==1) {
			return n;
		}
		
	
		
		
		long ans1,ans2=0;
		
		if(dp[n-1]==-1) {
			ans1 = fib(n-1,dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];	
		}
		
		
		if(dp[n-2]==-1) {
			ans2 = fib(n-2,dp);
			
			dp[n-2] = ans2;
			
		}else {
			ans2 = dp[n-2];
		}
		
		return ans1 + ans2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		
		long dp[] = new long[n+1];
		for(int i=0; i<=n; i++) {
			dp[i]=-1;
		}
		
		long ans = fib(n,dp);
		System.out.println(ans);

	}

}
