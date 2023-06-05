package DpPatterns;
import java.util.*;

public class RectangleCutting {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int dp[][] = new int[a+1][b+1];
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				
				int m;
				
				if(i==j) {
					continue;
				}else if(i<j) {
					m = (j+1)/2;
					dp[i][j] = 1+dp[i][m]+dp[i][j-m];
				}else {
					m= (i+1)/2;
					dp[i][j] = 1 + dp[m][j]+dp[i-m][j];
				}
			}
		}
		
		System.out.println(dp[a][b]);
		

	}

}
