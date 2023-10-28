package day05;

public class Quiz2 {
	// 여기에 함수를 만들어서 똑같은 결과가 나오도록 작성해보세요
	static int parsInt(String str) {	
		int num = 0;					
		for(int i = 0; i < str.length(); i++) {	// 문자열을 순서대로 반복하면서
			char ch = str.charAt(i);			// 각각의 글자를 추출하여
			System.out.println(ch);				// 출력으로 확인해보고
			if('0' <= ch && ch <= '9') {		// 글자가 원하는 조건을 만족하면
				num *= 10;						// 결과 변수에 더하여
				num += ch - 48;
			}		
		}
		System.out.println("num : " + num);		// 반복 끝난 후 확인해보고
		return num;								// 반환한다
		
	}
	
	public static void main(String[] args) {
		String s1 = "1234";
		int n2 = Integer.parseInt(s1) + 1;
		System.out.println(n2);
		
		int n3 = parsInt(s1) + 1;
		System.out.println(n3);
	}
}
