package day03;

public class Ex02 {
	public static void main(String[] args) {

		// 대문자 A부터 Z까지 한줄에 출력하세요
		// 각 글자는 ,로 구분하고 마지막에는 콤마가 없어야 합니다

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
//			if(ch != 'Z') {
//				System.out.print(", ");
//			}
			String next = (ch == 'Z') ? "\n" : ", ";
			System.out.print(next);
		}
	}
}
