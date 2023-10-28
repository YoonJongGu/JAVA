package _class;

class Score {	// 객체를 만들기 위한 설계도의 역할을 수행하는 클래스
	
	int kor, eng, mat;	// 객체의 세부 [속성]값을 저장할 변수 (멤버 필드)
	
	void show() {		// 객체의 [기능]을 표현하는 함수 (멤버 메서드)
		System.out.println("국어점수 : " + kor);	
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
	}
}

/*
 * 		클래스의 구성 요소
 * 
 * 	- 필드 : 객체의 속성을 표현하기 위한 변수, 메서드에서는 필드에 접근할 수 있다
 * 	- 메서드 : 객체의 기능을 표현하기 위한 함수, 메서드 내부에서 별도의 지역변수를 선언할 수도 있다
 * 	- 생성자 : 객체를 생성할 때 호출되는 특수한 함수, 오버로딩이 가능하다
 * 	- 접근 제한자 : 객체 내부 요소를 보호하기 위한 형식. 외부로부터의 접근가능 여부를 지정한다.
 */

public class Ex02 {
	public static void main(String[] args) {
		// 1) 세 과목의 점수를 배열로 처리함
		int[] arr = { 100, 99, 87 };
		System.out.println("국어점수 : " + arr[0]);	// 0은 국어점수이고
		System.out.println("영어점수 : " + arr[1]);// 1은 영어점수이고
		System.out.println("수학점수 : " + arr[2]);// 2는 수학점수이다 (라고 기억해야 함)
		System.out.println();
		
		// 2) 세 과목의 점수를 클래스에 의한 객체로 처리함
		Score ob = new Score();
//		Score ob2 = { 100, 99, 87 };
		ob.kor = 100;
		ob.eng = 99;
		ob.mat = 87;
//		System.out.println("국어점수 : " + ob.kor);	
//		System.out.println("영어점수 : " + ob.eng);
//		System.out.println("수학점수 : " + ob.mat);
		ob.show();
	}
}
