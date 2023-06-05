package DpPatterns;
import java.util.*;

public class bookShop {

	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int x = s.nextInt();
			int price[] = new int[n];
			int pages[] = new int[n];
			for(int i=0; i<n; i++) {
				price[i] = s.nextInt();
			}
			
			for(int i=0; i<n; i++) {
				pages[i] = s.nextInt();
			}
			
			bookShop2(pages,price,x,n);
		}
	
	private static void bookShop1(int[] pages, int[] price, int x, int n) {
			
			int dp[][] = new int[n+1][x+1];
	
			for(int i=n-1; i>=0; i--) {
		
				for(int j=1; j<price[i] && j<=x; j++) {		
					dp[i][j] = dp[i+1][j];
				}
				
				for(int j=price[i];j<=x; j++) {
					dp[i][j] = dp[i+1][j-price[i]] + pages[i];	
					dp[i][j] = Math.max(dp[i][j], dp[i+1][j]);	
				}	
			}
			
			System.out.println(dp[0][x]);
			
			
			
		}

	private static void bookShop2(int[] pages, int[] price, int x, int n) {
		

		
		int dp[] = new int[x+1];
		
		for(int i=n-1; i>=0; i--) {
			
			for(int j=x; j>=price[i]; j--) {
				dp[j] = Math.max(dp[j],pages[i]+dp[j-price[i]]);
			}
		}
		
		System.out.println(dp[x]);
		
	}
}
