package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.print("정수 입력 : ");
		try {	// 다음 코드를 시도하여
			n1 = sc.nextInt();
			System.out.println("n1 : " + n1);
			
		} catch(InputMismatchException e) {	// 지정한 타입의 예외가 발생하면 객체 e로 받는다
//			e.printStackTrace();	// 예외 발생 스택을 순서대로 출력한다
			System.err.println("정수를 입력해야 합니다 !!");
		}
		System.out.println("끝");
		sc.close();
	}
}
