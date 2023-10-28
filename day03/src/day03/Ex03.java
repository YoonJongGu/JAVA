package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String bar1 = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		String bar2 = "│    │    │    │    │    │    │";
		Scanner sc = new Scanner(System.in);
		
		// 0 ~ 30 사이의 정수를 입력 받아서, 입력 받은 위치에 ↑ 가 위치하도록 코드를 작성하세요
		
		System.out.print("0 ~ 30 사이 정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(bar1 + bar2);
		
		for (int i = num; i >= 0; i--) {			
			char next = (i == 0) ? '↑' : ' ';
			System.out.print(next);
		}
		sc.close();

	}
}
