package DpPatterns;
import java.util.*;

class Cards{
	int val;
	Cards prevTop;
	
	public Cards(int val,Cards c) {
		this.val = val;
		prevTop = c;
	}
}

public class IncreasingSubsequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();	
		}
		
		longestIncSubsequence(arr,n);
		System.out.println("\n\n");
		lisBest(arr,n);

	}
	
	//Patience algo
	
	private static void lisBest(int[] arr,int n) {
		
		ArrayList<ArrayList<Cards>> piles = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			int hostPileIndex = getHostPileIndex(piles,arr[i]);
			ArrayList<Cards> hostPile;
			//Cards curr = new Cards(arr[i],);
			Cards prev=null;
			
			if(hostPileIndex<0) {
				
				hostPile = new ArrayList<>();
				piles.add(hostPile);	
			}else {
				hostPile = piles.get(hostPileIndex);
			}
			
			if(hostPileIndex>0) {
				ArrayList<Cards> prevPile = piles.get(hostPileIndex-1);
				prev = prevPile.get(prevPile.size()-1);
			}
			
			hostPile.add(new Cards(arr[i],prev));
		}
		
		System.out.println(piles.size());
			
	}

	private static int getHostPileIndex(ArrayList<ArrayList<Cards>> piles, int i) {
		
		int l = 0;
		int r = piles.size()-1;
		
		
		while(l<=r) {
			int m = l+(r-l)/2;	
			
			ArrayList<Cards> currPile = piles.get(m);
			
			Cards top = currPile.get(currPile.size()-1);
			
			if(top.val==i) {
				return m;
			}else if(top.val<i) {
				l = m+1;
			}else {
				r = m-1; 
			}
		}
		
		if(l>=piles.size()) {
			return -1;
		}else {
			return l;
		}
		
	}

	private static void longestIncSubsequence(int[] arr, int n) {
		
		int dp[] = new int[n];
		dp[0] = 1;
		int max = 1;
		
		for(int i=1; i<n; i++) {
			dp[i]= 1;
			for(int j=i-1; j>=0; j--) {
				if(arr[i]>arr[j] && dp[i]<=dp[j]) {
					dp[i] =dp[j]+1;
					if(max<dp[i]) {
						max=dp[i];
					}
				}
			}
			
		}
		System.out.println(max);
	}

}
