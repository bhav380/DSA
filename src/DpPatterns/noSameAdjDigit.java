package DpPatterns;

import java.util.*;

public class noSameAdjDigit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		
		long ans = count(a,b);
		System.out.println(ans);
	}

	private static long count(long a, long b) {
		
		
		
		String strA = (a-1)+"";
		String strB = b+"";
		long countA,countB;
		
		long dp[][][][] = new long[strB.length()+1][2][10][2];
		
		for(long[][][] d3 : dp) {
			for(long[][]d2 : d3) {
				for(long[]d1 :d2) {
					Arrays.fill(d1, (long)-1);
					
				}
			}
		}
		
		countA = digitDP(strA,-1,1,1,dp);
		
		for(long[][][] d3 : dp) {
			for(long[][]d2 : d3) {
				for(long[]d1 :d2) {
					Arrays.fill(d1, (long)-1);
					
				}
			}
		}
		
		
		
		
		
		
		countB = digitDP(strB,-1,1,1,dp);

		
	
		

		
		return countB-countA;
	}

	private static long digitDP(String num,int prev,int tight,int leadingZeros,long dp[][][][]) {
		
		if(num.length()==0) {
			return (long)1;
		}
		if(prev!=-1 && dp[num.length()][leadingZeros][prev][tight]!=-1) {
			return dp[num.length()][leadingZeros][prev][tight];
		}
		
		long count = 0;
		int ub = tight==1?num.charAt(0)-'0':9;
		
		for(int i=0; i<=ub; i++) {
			
			if(prev==i && leadingZeros==0) {
				continue;
			}
			
			count += digitDP(num.substring(1),i,tight&(i==ub?1:0),leadingZeros&(i==0?1:0),dp);
		}
		
		if(prev!=-1) {
		
		  dp[num.length()][leadingZeros][prev][tight] = count;
		}
		return count;
		
	}

}
