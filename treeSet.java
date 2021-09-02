package algo_java;
import java.util.TreeSet;

public class treeSet {
	
	public static TreeSet<String> findOrder(char[] chSet, int length){
        TreeSet<String> set = new TreeSet<String>();
        if(length == 0){
            set.add("");
            return set;
        }
        for(int i = 0;i<chSet.length;i++){
            for(int j = 0;j<length;j++){
                for(String arr: findOrder(chSet, j)){
                    set.add(String.valueOf(arr+chSet[i]));
                }
            }
            
        }
        return set;
    }
    public static int solution(String word) {
        int answer = 0;
        
        int cnt = 0;
        char[] characters = {'A', 'E', 'I', 'O', 'U'};
        
        for(String seq : findOrder(characters, 5)){
            // System.out.println(cnt+", "+seq);
            cnt++;

            if(seq.equals(word)){
                answer = cnt;
                break;
            }
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("AAAAE"));
		System.out.println(solution("AAAE"));
		System.out.println(solution("I"));
		System.out.println(solution("EIO"));
	}

}
