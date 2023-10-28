package day05;

public class Quiz3 {
	// 배열이나 문자열의 인덱스는 항상 0부터 시작하여 (길이 - 1)까지 존재한다
	static int min(int... args) {
		int min_i = args[0];		
		for(int i = 1; i < args.length; i++) {
			if (args[i] < min_i) {
				min_i = args[i];
			}
		}
		return min_i;
	}
	
	static int count(String str, char ch) {
		int num = 0;
//		System.out.println(str.contains(ch + ""));
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if(current == ch) {	// ch와 current의 자료형은 char(primitive)
				num++;
			}
		}
		return num;
	}

/*	
	static boolean check(String str) {
		int count1 = count(str, '-');
		
		String[] arr = str.split("-");		
		int count2 = arr.length;
		int count3 = 0;
		for(int i = 0; i < arr.length; i++) {		
			if(arr[i].length() == 4) {
				count3++;
			}
		}
		
		if(str.length() == 19 && count1 == 3 && count2 == 4 && count3 == 4) return true;	
			
		return false;
		
	}
*/	
	
	static boolean check(String str) {
		boolean flag = true;
		
		if(str.length() != 19) {
			flag = false;
		}
		
		if(count(str, '-') != 3) {
			flag = false;
		}
		
		String[] arr = str.split("-");
		if(arr.length != 4) {
			flag = false;
		}
		
		for(int i = 0; i < arr.length; i++) {
			String s = arr[i];
			if(s.length() != 4) {
				flag = false;
			}
		}
		
		return flag;
		
	}
	
	public static void main(String[] args) {
		// 1) 정수를 여러개 전달받아서, 최소값을 반환하는 함수를 작성하세요
		int n1 = min(10, 5, 11);
		System.out.println("n1 : " + n1);
		
		// 2) 문자열에서 특정 글자가 몇개 포함되어있는지 반환하는 함수를 작성하세요
		int n2 = count("Life is too short, you need python", 'e');
		System.out.println("n2 : " + n2);
		
		// 3) 문자열 형태로 카드번호를 입력받아서, 길이가 맞는지 확인하는 함수를 작성하세요
		// 전체길이, -의 개수, 분리했을 때 각 단위의 길이
		boolean b1 = check("1234-1234-1234-1234");	// true
		boolean b2 = check("867-2356123-1234567");	// false
		boolean b3 = check("930516-2345678");		// false		
		System.out.printf("%b, %b, %b\n", b1, b2, b3);
	}
}
