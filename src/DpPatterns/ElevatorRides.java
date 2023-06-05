package DpPatterns;
import java.util.*;

public class ElevatorRides {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int x = s.nextInt();
		
		int persons[] = new int[n];
		for(int i=0; i<n; i++) {
			persons[i] = s.nextInt();
		}
		
		minElevatorRides(persons,x,n);
		
		
		

	}

	private static void minElevatorRides(int[] persons, int x, int n) {
		
		Arrays.sort(persons);
		
		int minRides = 0;
		int count = n;
		
		int wt = x;
		
		boolean dp[] = new boolean[n];
		
		while(count>0) {
			
			wt = x;
			
			for(int i=n-1; i>=0; i--) {
				
				if(wt>= persons[i] && !dp[i]) {
					wt-= persons[i];
					dp[i] = true;
					count--;
				}
			}
			minRides++;
			n--;
		}
		System.out.println(minRides);
		
	
	}

}
