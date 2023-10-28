package day02;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// if 문제
		
		/*
		 * 		이용 시간에 따라 요금을 책정하는 놀이기구가 있다
		 * 		기본요금 3천원으로 시작하여 10분당 추가요금 500원이 발생한다
		 * 		요금표는 아래와 같은 규칙으로 적용한다
		 * 
		 * 		0 ~ 30		3000원
		 * 		31 ~ 40		3500원
		 * 		41 ~ 50		4000원
		 * 		...
		 * 
		 * 		이용시간을 분으로 입력 받아서, 금액을 계산하여 출력하는 코드를 작성하세요
		 */
		
		// 1) 변수
		Scanner sc = new Scanner(System.in);
		int fee = 3000;
		int time = 0;
		
		// 2) 입력
		System.out.print("이용시간(분) 입력 : ");
		time = sc.nextInt();
		
		// 3) 제어
		if(time > 30) {	
			if (time % 10 == 0) {				
				fee = fee + 500 * (time - 30) / 10;	
			}
			else {				
				fee = fee + 500 * ((time - 30) / 10 + 1);
			}
		}
		
		// 4) 출력
		System.out.println("이용금액 : " + fee + "원");
		
		// 5) 마무리
		sc.close();	
		
		System.out.println(getFee(90));
	}
	
	// This method must return a result of type int 
	static int getFee(int time) {
		int fee, overcost;
		
		if(time > 30) {
			if(time % 10 != 0) {
				overcost = (((time - 30) / 10) + 1) * 500;
			}
			else {
				overcost = ((time - 30) / 10) * 500;
			}
			fee = 3000 + overcost;
			return fee;
		}
		return 3000;
	}
	
}
