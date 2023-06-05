package ArrayList;
import java.util.ArrayList;

public class UseArrayList {
	
	public static ArrayList<Integer> removeConsecutive(int arr[]){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		result.add(arr[0]);
		
		for(int i=0,j=0;i<arr.length;  i++) {
			if(result.get(j)!=arr[i]) {
				result.add(arr[i]);
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,1,2,2,3,2,2,1,1,4,4};
		
		ArrayList<Integer> newArr = removeConsecutive(arr);
		
		for(int i: newArr) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(1);
//		arr.add(0);
//		arr.add(85);
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.print(arr.get(i)+" ");
//		}
//		
//		System.out.println();
//		
//		arr.add(1,99);
//		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.print(arr.get(i)+" ");
//		}
//		
//		System.out.println();
//		
//		arr.set(2,100);
//		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.print(arr.get(i)+" ");
//		}
//		
//		System.out.println();
//		
//		Integer a = 99;
//		
//		arr.remove(a);
//		
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}

	}

}
