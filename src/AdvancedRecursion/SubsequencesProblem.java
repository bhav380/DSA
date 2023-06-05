package AdvancedRecursion;
import java.util.*;

public class SubsequencesProblem {
	
	public static void printAllSubsequences(String str,String subs,ArrayList<String> arr) {
		
		if(str.length()==0) {
			System.out.println(subs);
			arr.add(subs);
			return;
		}
		
		printAllSubsequences(str.substring(1),subs+str.charAt(0),arr);
		printAllSubsequences(str.substring(1),subs,arr);	
	}
	
	public static ArrayList<String> returnAllSubsequences(String str){
		if(str.length()==0) {
			String s= new String("");
			ArrayList<String> ans = new ArrayList<>();
			ans.add(s);
			return ans;
		}
		
		ArrayList<String> smallOutput = returnAllSubsequences(str.substring(1));
		
		int len = smallOutput.size();
		
		for(int i=0; i<len; i++) {
			
			smallOutput.add(smallOutput.get(i));
			smallOutput.set(i,str.charAt(0)+smallOutput.get(i));
			
		}	
		return smallOutput;
		
		
	}
	
	public static void printAns(ArrayList<String> arr) {
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arr = new ArrayList<String>();
		
		printAllSubsequences("babc","",arr);   //only recursion
		System.out.println("hello");
		ArrayList<String> ans = returnAllSubsequences("babc");  // recursion + iteration approach
		printAns(ans);
		System.out.println("hi");
		printAns(arr);
		
		
	}

}
