package programmers;

public class Quiz12954 {
	
	static public long[] solution(int x, int n) {
		long[] answer = new long[n]; 
		long p = x;
		for(int i = 0; i < n; i++) {
			answer[i] = p;
			p += x;
		}
        return answer;
    }	

}
