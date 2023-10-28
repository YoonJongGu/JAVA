package _class;

public class Ex01 {
	public static void main(String[] args) {
		// 단일 데이터를 저장하기 위해 필요한 요소 : 변수, 자료형
		// 어떤 유형의 데이터를 어떤 이름의 변수에 저장할 것인가?
		
		// 동일한 자료형의 여러 데이터를 저장하기 위한 요소 : 배열
		// 어떤 유형의 데이터를 몇개나 저장할 것인가?
		
		// 서로 다른 자료형의 여러 데이터를 저장하기 위한 요소 : 구조체(C언어), 클래스(C++, Java)
		// 서로 다른 자료형의 데이터를 저장할 수 있는 변수를 가지고 있다
		// 구조체와 달리 클래스는 변수 및 함수를 포함할 수 있다
		
		// 클래스는 자료형이다
		// 클래스에 의해 생성된 데이터를 객체라고 한다
		
		System.out.println('H' == 72);
		System.out.println('1' == 49);
		char ch1 = 65;
		char ch2 = 'A';
		System.out.println(ch1 == ch2);
		
		String s1 = "Hello";
		int n2 = 72;
		
//		System.out.println(s1 == n2); // (X)
		// char == int
		// String == char
		// String == int
		
	}
}
