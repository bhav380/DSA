package DpPatterns;
import java.util.*;

public class digitDP_xSum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int x = s.nextInt();
		
		
		int ans = countSumXAtoB(a,b,x);
//		int ans2 = brute(a,b,x);
		System.out.println(ans);
//		System.out.println(ans2);
		

	}
	
	public static int brute(int a,int b, int x) {
		int count = 0;
		for(int i=a; i<=b; i++) {
			int sum = 0;
			int tmp = i;
			while(tmp>0) {
				sum+=tmp%10;
				tmp/=10;
			}
			if(sum==x) {
				count++;
			}
		}
		return count;
	}

	private static int countSumXAtoB(int a, int b, int x) {
		
		int digits = 0;
		int tmp = a-1;
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
	
		while(tmp>0) {		
			digits++;
			arr1.add(0,tmp%10);
			tmp/=10;
		}
		
		int[][][] dp2 = new int[digits][x+1][2];
		for(int i=0; i<digits ; i++) {
			for(int j=0; j<=x; j++) {
				for(int k=0; k<2; k++) {
					dp2[i][j][k] = -1;
				}
			}
		}
		
		digits=0;
		tmp = b;
		
		
		while(tmp>0) {		
			arr2.add(0,tmp%10);
			digits++;
			tmp/=10;
		}
		
		int[][][] dp1 = new int[digits][x+1][2];
		for(int i=0; i<digits ; i++) {
			for(int j=0; j<=x; j++) {
				for(int k=0; k<2; k++) {
					dp1[i][j][k] = -1;
				}
			}
		}
		
//		for(int i=0; i<arr2.size(); i++) {
//			System.out.print(arr2.get(i));
//			System.out.println("hwi");
//		}
//		System.out.println();
//		
		
//		
		int count = digitDP(arr2,x,0,true,dp1)-digitDP(arr1,x,0,true,dp2);
		return count;
	}

	private static int digitDP(ArrayList<Integer> arr, int x, int i, boolean tight,int dp[][][]) {
		
		if(i==arr.size()) {
			if(x==0) {
				return 1;
			}
			return 0;
		}
		if(x<0) {
			return 0;
		}
		
		if(dp[i][x][tight?1:0]!=-1) {
			return dp[i][x][tight?1:0];
		}
		
		int ub = tight==true ? arr.get(i): 9;
		int count = 0;
		
		for(int j=0; j<ub; j++) {
			count+= digitDP(arr,x-j,i+1,false,dp);
		}
		
		if(!tight) {
			count+=digitDP(arr,x-ub,i+1,false,dp);
		}else
	     	count+=digitDP(arr,x-ub,i+1,true,dp);
		
		dp[i][x][tight==true?1:0] = count;
		return count;
	}

}
