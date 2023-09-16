package codersgig;
import java.util.*;

public class insertOperatorsBetweenDigits {
	
	static String operators[] = {"+","-","/","*"};

	public static void main(String[] args) {
		
		String num = "123";
		int target = 8;
		
		
		//remove leading zeros
		while(num.charAt(0)=='0') {
			num = num.substring(1);
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		insertOperators(num.substring(1),target,num.charAt(0)+"",ans);
		
		for(String exp : ans) {
			System.out.println(exp);
		}
		

	}
	


	private static void insertOperators(String num, int target, String expression, ArrayList<String> ans) {
		
		
		if(num.length()==0) {
			
			if(ExpressionEqualsTarget(target,expression)) {
				ans.add(expression);
			}
			return;
		}
		
		
		
		for(int i=0; i<4; i++) {
			
			insertOperators(num.substring(1),target,expression+operators[i]+num.charAt(0),ans);	
		}	
	}



	private static boolean ExpressionEqualsTarget(int target, String expression) {
		
		
		Stack<Double> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		 double num=0;
		 
		int count = 0;
		
		for(int i=0; i<expression.length(); i++) {
			char ch = expression.charAt(i);
			
			if(ch=='+' || ch=='-'){
				s1.push(num);
				s2.push(ch);
				count++;
			}else if(ch=='*'){
				
				num *= expression.charAt(i+1)-'0';
				i++;
				
			}else if(ch=='/') {
				num = num /expression.charAt(i+1)-'0';
				i++;
				
			}else{
				num = ch-'0';
				
			}
		}
		
		s1.push(num);

		Stack<Double> tmp1 = new Stack<>();
		Stack<Character> tmp2 = new Stack<>();
		while(!s1.isEmpty()) {
			tmp1.push(s1.pop());
		}
		
		s1=tmp1;
		
		while(!s2.isEmpty()) {
			tmp2.push(s2.pop());
		}
		
		s2=tmp2;
		
		while(!s2.isEmpty()) {
			
			double a = s1.pop();
			double b = s1.pop();
			
			char op = s2.pop();
			
			if(op=='-') {
				s1.push(a-b);
			}else {
				s1.push(b+a);
			}
					
		}
	
		double val = s1.peek();
		if(val == target) {
			return true;
		}
		return false;
	}

}
