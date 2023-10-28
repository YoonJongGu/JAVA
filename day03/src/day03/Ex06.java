package day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// if 문제
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, n5, min;
		
		// 1) 세 정수를 입력 받아서, 그 중에서 최소값을 찾아서 출력하세요
		System.out.print("세 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		min = n1;
		if (min > n2) min = n2;
		if (min > n3) min = n3;
		System.out.println("최소값 : " + min);
		
		// 2) 정수를 입력 받아서, 정수의 절대값을 출력하는 코드를 작성하세요
		System.out.print("정수 입력 : ");
		n4 = sc.nextInt();
		if (n4 < 0) n4 *= -1;
		System.out.println("절대값 : " + n4);
		
		// 3) 정수를 입력 받아서, 입력받은 수가 홀수 인지 짝수인지 판별하여 결과를 문자열로 출력하세요
		System.out.print("정수 입력 : ");
		n5 = sc.nextInt();
		if (n5 % 2 == 0)	System.out.println(n5 + "는 짝수 입니다");
		else				System.out.println(n5 + "는 홀수 입니다");
		
		sc.close();
	}
}
