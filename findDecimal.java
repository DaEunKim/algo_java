package algo_java;
import java.util.*;

public class findDecimal {

	public static int combination(int n, int r) {
		System.out.println(n + ", "+ r);
		if(n == r || r == 0) 
			return 1; 
		else 
			return combination(n - 1, r - 1) + combination(n - 1, r); 
	}
	public static int solution(String numbers) {
        int answer = 0;
//        combination(2, 1);
//        Vector<String> v = new Vector<String>();
//        for(int i = 1;i<=numbers.length();i++) {
//            System.out.println(combination(numbers.length(), i));
//            
//        	
//        }
//        
//        for(String i : v) {
//        	System.out.println(i);
//        }
        int[] numArr = new int[numbers.length()];
        for(int i = 0;i<numbers.length();i++) {
        	
//        	System.out.println((int)numbers.charAt(i)-'0');
        	numArr[i] = (int)numbers.charAt(i)-'0';
        	
        }
//        System.out.println(combination(2, 1));
        
        for(int i = 0;i<numbers.length();i++) {
        	combination(numbers.length(), i);
        	System.out.println(numArr[i]);
        	
        	
        	
        }
       
        return answer;
        
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "17";
		solution(numbers);
//		System.out.println(solution(numbers));
		
	}

}
