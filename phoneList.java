package programmers;

import java.util.Arrays;

public class phoneList {
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
//		for (int i = 0; i < phone_book.length; i++) {
//			for(int j = 0;j<phone_book.length;j++) {
//				if(i==j)
//					continue;
//				
//				if(phone_book[j].indexOf(phone_book[i]) == 0) {
//					answer = false;
//				}
//			}
//		}
		Arrays.sort(phone_book);
		for(int i = 0;i<phone_book.length;i++) {
			System.out.println(phone_book[i]);
		}
		for(int i=0; i<phone_book.length-1; i++) {
			if(phone_book[i].startsWith(phone_book[i+1])) {
            	answer = false;
            	
            }
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
			}
           
        }
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
		
	}

	
}
