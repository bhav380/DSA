package codersgig;

public class powerFunc {
	
public static void main(String[] args) {
		
		double a=18.232;
		int b=-2;
		
		double ans = pow(a,b);
		
		System.out.println(ans);

	}

	private static double pow(double a, int b) {
		
		double ans = 1;
		
		int sign=1;
		if(b<0) {
			sign=-1;
			b=b*-1;
		}
		
		
			
		while(b>=1) {
			
			if(b%2!=0) {
				 ans = ans*a;
			}
			
			a=a*a;
			b/=2;
		}
		
		if(sign==-1) {
			ans = 1.0/ans;
		}
		
		return ans;
	}


}
