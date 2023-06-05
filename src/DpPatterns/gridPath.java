package DpPatterns;
import java.util.*;

public class gridPath {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		char grid[][] = new char[n][n];
		for(int i=0; i<n; i++) {
			
			String str = s.next();
			
			for(int j=0; j<n; j++) {
				grid[i][j] = str.charAt(j);
			}
		}
		
		gridPath(grid,n);
	}

	private static void gridPath(char[][] grid, int n) {
		
		int dp[][]  = new int[n+1][n+1];
		
		dp[n][n-1] = 1;
		
		for(int i=n-1; i>=0; i--) {
			for(int j=n-1;j>=0; j--) {
				if(grid[i][j]=='*') {
					dp[i][j] = 0;
					
				}else {
					dp[i][j] = dp[i+1][j]+dp[i][j+1]%1000000007;
				}
			}
		}
		
		System.out.println(dp[0][0]);
	}

}


//for(int i=n-1; i>=0; i--) {
//	for(int j=n-1;j>=0; j--) {
//		System.out.print(dp[i][j]+" ");
//	}
//	System.out.println();
//}
