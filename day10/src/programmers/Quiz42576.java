package programmers;

import java.util.Arrays;

public class Quiz42576 {
	
	static public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);	// 두 배열을 정렬한다
		Arrays.sort(completion);
		
		String answer = participant[participant.length - 1];	// 어차피 정답은 마지막참가자
		
		for(int i = 0; i < completion.length; i++) {	// 완주자의 목록을 순서대로 조회하면서
			if(!participant[i].equals(completion[i])) {	// 만약 참가자가 완주자가 아니라면,
				answer = participant[i];				// 그 참가자가 정답이다 (완주하지 못한 선수)
				break;									// 정답을 찾았으니, 반복을 중단한다
			}
		}
		
	    return answer;	// 정답을 반환한다
	}
	
	public static void main(String[] args) {
//		String result;
		String[] p1 = {"leo", "kiki", "eden"};
		String[] c1 = {"eden", "kiki"};
//		p1 = sort(p1);
//		c1 = sort(c1);
//		result = equals(p1, c1);
//		System.out.println(result);
		
		String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c2 = {"josipa", "filipa", "marina", "nikola"};
//		p2 = sort(p2);
//		c2 = sort(c2);
//		result = equals(p2, c2);
//		System.out.println(result);
		
		String[] p3 = {"mislav", "stanko", "mislav", "ana"};
		String[] c3 = {"stanko", "ana", "mislav"};
//		p3 = sort(p3);
//		c3 = sort(c3);
//		result = equals(p3, c3);
//		System.out.println(result);

		
		System.out.println(solution(p1, c1).equals("leo"));
		System.out.println(solution(p2, c2).equals("vinko"));
		System.out.println(solution(p3, c3).equals("mislav"));
		
	}

//	static String[] sort(String[] arr) {		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i].compareTo(arr[j]) > 0) {
//					String tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}		
//		return arr;
//	}
	
//	static String equals(String[] p, String[] c) {
//		String str = p[p.length - 1];
//		for(int i = 0; i < c.length; i++) {
//			if(!p[i].equals(c[i])) {
//				str = p[i];				
//			}
//		}
//		return str;
//	}
}
