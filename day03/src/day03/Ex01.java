package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 길이가 정해지지 않은 반복
		// 사용자에게 정수를 입력 받아서 합계를 누적시킨다
		// 만약 0을 입력하면 '더 이상 더하지 않겠다' 라는 의미로 생각하여 반복을 중단한다
		
		// 변수
		int input = 1, sum = 0;
		
		while(input != 0) {
			// 입력
			System.out.print("누적할 값 입력(0입력시 종료) : ");
			input = sc.nextInt();
			
			// 연산
			sum += input;
		}
		// 출력, 마무리
		System.out.println("입력한 값들의 합 : " + sum);	
		sc.close();
	}
}
