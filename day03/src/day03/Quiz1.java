package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		int current;
		
		/*
		 * 		1층에서 15층 사이의 엘리베이터 3개가 있습니다
		 * 		사용자에게 현재 층을 입력 받아서 가장 가까운 엘리베이터가 이동할 수 있도록
		 * 		출력문을 만들어서 출력해주세요
		 */
		// 가장 가까운 엘리베이터
		// 거리가 최소값인 엘리베이터
		// 절대값(현재 층 - 대상 층) 중에서 최소값으 가지는 엘리베이터
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		System.out.print("현재 층 입력 : ");
		current = sc.nextInt();		// 현재 층수를 입력받는다
		
		int c_n1 = current - n1 < 0 ? (current - n1) * -1 : current - n1;	// 현재 층과 각 엘리베이터 층수의 [차이]를 구하고 
		int c_n2 = current - n2 < 0 ? (current - n2) * -1 : current - n2;	// 위 혹은 아래 방향에 관계없이 [거리]를 구하기 위해 [절대값] 처리한다
		int c_n3 = current - n3 < 0 ? (current - n3) * -1 : current - n3;

//		if (c_n1 < 0) c_n1 *= -1;
//		if (c_n2 < 0) c_n2 *= -1;
//		if (c_n3 < 0) c_n3 *= -1;
		
		//System.out.printf("%d, %d, %d\n", c_n1, c_n2, c_n3);
		
		int min = c_n1;				// [거리 중에서 최소값]을 찾아낸다
		if (min > c_n2) min = c_n2;
		if (min > c_n3) min = c_n3;
		
		//System.out.println(min);
		
		// 최소값과 일치하는 요소가 이동하는 형식을 출력한다
		if (min == c_n1) 		System.out.println("1번 엘리베이터가 움직입니다.");
		else if (min == c_n2) 	System.out.println("2번 엘리베이터가 움직입니다.");
		else 					System.out.println("3번 엘리베이터가 움직입니다.");

		sc.close();
		
	}
}
