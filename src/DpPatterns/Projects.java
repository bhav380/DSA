package DpPatterns;
import java.util.*;

class Project {
	
	long s;
	long e;
	long m;

}
class cmp implements Comparator<Project>{
	
	@Override
	public int compare(Project o1, Project o2) {

		return (int)(o1.e-o2.e);
	}
}


public class Projects{

	//
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		Project[] arr = new Project[n];
	///	arr[0] = new Project(0,0,0);
		for(int i=0; i<n; i++) {
			
			arr[i] = new Project();
			
			long st =s.nextLong();
			long e = s.nextLong();
			long m = s.nextLong();
			
			arr[i].s = st;
			arr[i].e = e;
			arr[i].m = m;
			
		}
		
		maxMoney(n,arr);
	}
	
	private static void sort(Project[] arr,int i,int j) {
		
		if(i<j) {
			
			
			int m = (i+(j-i)/2);
			
			
			
			sort(arr,i,m);
		    sort(arr,m+1,j);
		    
			
			merge(arr,i,j,m);
		
		}
		
	}
	
	private static void merge(Project[] arr, int s, int e, int m) {
		
		int i = s;
		int j = m+1;
		int n1 = m;
		int n2 = e;
		
		Project[] ans = new Project[e-s+1];
		
		int k= 0;
		
		
		while(i<=n1 && j<=n2) {
			
			if(arr[i].e > arr[j].e) {
				ans[k++] = arr[j++];
			}else{
				ans[k++] = arr[i++];
			}
		}
		
		while(i<=n1) {
			ans[k++] = arr[i++];
		}
		while(j<=n2) {
			ans[k++] = arr[j++];
			
		}
		
		k= 0;
		
		for(i=s; i<=e; i++) {
			arr[i] = ans[k++];
		}
		
	}
	public static int lower_bound(long array[], long key,int n){
 
        int index = Arrays.binarySearch(array,0,n+1, key);
 
        // If key is not present in the array
        if (index < 0) {
 
            // Index specify the position of the key
            // when inserted in the sorted array
            // so the element currently present at
            // this position will be the lower bound
            return Math.abs(index) - 1;
        }
 
        // If key is present in the array
        // we move leftwards to find its first occurrence
        else {
 
            // Decrement the index to find the first
            // occurrence of the key
 
            while (index > 0) {
 
                // If previous value is same
                if (array[index - 1] == key)
                    index--;
 
                // Previous value is different which means
                // current index is the first occurrence of
                // the key
                else
                    return index;
            }
 
            return index;
        }
    }

	private static void maxMoney(int n,Project[] arr) {
		
		Arrays.sort(arr,0,arr.length,new cmp());

		
		long dp[] = new long[n+1];
		
		long[]e = new long[n];
		for(int i=0; i<n; i++) {
			e[i] = arr[i].e;
		}
		
		dp[1] = arr[0].m;
		
		
		for(int i=2; i<=n; i++) {
			
			
			
			//int j = getPrevEndIndex(arr[i-1].s,arr,i-2);
			
			int j = lower_bound(e,arr[i-1].s,i-2);
		
			
			dp[i] = Math.max(dp[i-1],arr[i-1].m+dp[j]);
		}
		
		System.out.println(dp[n]);
		
	}
	
	private static int getPrevEndIndex(long num, Project arr[],int j) {
		
	
		
		int i=0;
		
		while(i<=j) {
			int m = (i+(j-i)/2);
			
			if(num==arr[m].e) {
				return m;
			}else if(num<arr[m].e) {
				j = m-1;
			}else {
				i = m+1;
			}
		}
		return i;
			
	}
	
}



