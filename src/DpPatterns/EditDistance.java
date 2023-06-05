package DpPatterns;
import java.util.*;

public class EditDistance {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str1 = s.next();
		String str2 = s.next();
		
		editDistance(str1,str2);
		
		
	}

	private static void editDistance(String str1, String str2) {
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		int dp[][] = new int[n1+1][n2+1];
		
		for(int j=0; j<=n2; j++) {
			dp[n1][j] = Integer.MAX_VALUE;
		}
		
		for(int i=0; i<=n1; i++) {
			dp[i][n2] = Integer.MAX_VALUE;
		}
		
		dp[n1][n2] = 0; 
		
		for(int i=n1-1; i>=0; i--) {
			for(int j=n2-1; j>=0; j--) {
				
				if(str1.charAt(i)==str2.charAt(j)) {		
					dp[i][j] = dp[i+1][j+1];
				}else {
					dp[i][j] = 1+Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i][j+1]));
				}
			}
		}
		
		System.out.println(dp[0][0]);
		
	}

}
