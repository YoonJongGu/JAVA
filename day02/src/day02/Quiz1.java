package day02;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력 받은 후 출력하세요
		// 단, 주소는 띄어쓰기를 포함하여 입력할 수 있어야 합니다
		// 입출력에는 사용자의 입력에 따라 예외가 발생할 수 있기 때문에
		// 보통 IOException 처리를 해야하지만
		// Scanner는 내부 코드에서 예외 처리가 되어있어서, 예외 선언을 안해도 된다
		
		// 1) 변수 선언
		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
		
		// 2) 입력
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		// age = Integer.parseInt(sc.nextLine());	-> 해당 코드를 사용시 name의 값 또한 sc.nextLine()을 사용해야 한다.
		
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		address = sc.nextLine();
		
		// 3) 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		
		// 4) 마무리
		sc.close();
	}
}
