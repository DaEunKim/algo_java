package programmers;

import java.util.HashMap;
import java.util.Map.Entry;

public class camouHashAlgo {

	public static int solution(String[][] clothes) {
        int answer = 0;
        
        int[] visit = {0,};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0;i<clothes.length;i++) {
        	String key = clothes[i][1];
        	map.put(key,  map.getOrDefault(key, 0) + 1);
        }
        answer = 1;
        for (Entry<String, Integer> entry : map.entrySet()) {

			answer *= entry.getValue() + 1;

		}
		return answer - 1;
		
//        for(int i = 0;i<clothes.length;i++) {
//        	for(int j = 0; j<clothes.length; j++) {
//        		if(i == j)
//        			continue;
//	        	if(clothes[i][1] == clothes[j][1]) {
//	        		System.out.println(clothes[i][0]);
//	        	}
//	        	else {
//	        		visit[i] = 1;
//	        		answer++;
//	        	}
//        	}
//        	System.out.println("");
//        }
//        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] clothes = {{"yellowhat", "headgear"}, 
				{"bluesunglasses", "eyewear"}, 
				{"green_turban", "headgear"}};
		System.out.println(solution(clothes));
		
	}

}
