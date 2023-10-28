package day05;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열 관련 함수
		
		String s1 = "root:x:0:0:root:/root:/bin/bash";
		String[] arr = s1.split(":");	// ex) ":" - 구분자
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		String s2 = "https://search.naver.com/search.naver?query=아이유&where=image";
		String[] a1 = s2.split("\\?");	// ? 는 별도의 기능이 있어서 제거함
		String[] a2 = a1[1].split("&");
		for(int i = 0; i < a2.length; i++) {
			String[] a3 = a2[i].split("=");
			System.out.printf("%s : %s\n", a3[0], a3[1]);
		}
		System.out.println();
		
		// substring : 문자열 빼기(-)
		// a.substring(int beginIndex, int endIndex)
		
		String s3 = s2.substring(8, 24);
		System.out.println(s3);
		
		int beginIndex = s2.indexOf("search");
		int endIndex = s2.lastIndexOf("search") - 1;
		
		System.out.printf("%d ~ %d\n", beginIndex, endIndex);
		
		String s4 = s2.substring(beginIndex, endIndex);
		System.out.println(s4);
		
		// 문자열의 일치 비교
		String t1 = "apple";
		String t2 = new String("apple");	// Scanner로 입력받은 문자열도 똑같다
		String t3 = "apple";
		
		System.out.printf("%s, %s, %s\n", t1, t2, t3);
		
		// 바라보는 대상이 일치하는가
		System.out.println("t1 == t2 : " + (t1 == t2));		// 바라보는 대상이 다르기 때문에 false
		System.out.println("t1 == t3 : " + (t1 == t3));		// 바라보는 대상이 같기 때문에 true
		
		// 각 대상의 내용이 똑같은가
		System.out.println("t1.equals(t2) : " + t1.equals(t2));		// 내용을 비교해서 같기 때문에 true
		System.out.println("t1.equals(t3) : " + t1.equals(t3));		// 내용을 비교해서 같기 때문에 true
	}
}
