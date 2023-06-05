package DpPatterns;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		
		int[][] dp = new int[1001][2049];
	    for(int[] filler : dp) {
	    	Arrays.fill(filler, -1);
	    }
	    
	    
		int ans = countingTiles(dp,0,1,n,m);
		System.out.println(ans);


	}

	private static int countingTiles(int[][] dp,int mask ,int j, int rows,int cols) {
		
		if(j==cols+1) {
			if(mask==0) {
				return 1;
			}
			return 0;
		}
		
		if(dp[j][mask]!=-1) {
			return dp[j][mask];
		}
		
		ArrayList<Integer> nextMasks = new ArrayList<>();
		int ans = 0;
		generate_NextMasks(mask,1,0,rows,nextMasks);
		
		for(int nextMask : nextMasks) {
			ans = (ans + countingTiles(dp,nextMask,j+1,rows,cols))%(1000000007);	
		}
		
		dp[j][mask] = ans;
		return dp[j][mask];
		
		
	}

	private static void generate_NextMasks(int mask, int i, int nextMask, int rows, ArrayList<Integer> nextMasks) {
		
		if(i==rows+1) {
			nextMasks.add(nextMask);
			return;
		}


		
		
		if((mask & (1<<i))!=0 ) {
			generate_NextMasks(mask,i+1,nextMask,rows,nextMasks);
		   return;
		}
		
		if(i!=rows) {
			if((mask &(1<<i))==0 && (mask & (1<<(i+1)))==0) {
				
				generate_NextMasks(mask,i+2,nextMask,rows,nextMasks);	
			}
		}
		
		if((mask & (1<<i))==0) {
			
			generate_NextMasks(mask,i+1,nextMask+(1<<i),rows,nextMasks);	
		}
		
	}

	
}