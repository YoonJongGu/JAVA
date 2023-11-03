package ex02.answer;

import java.util.Scanner;

public class MainTemp {
	public static void main(String[] args) {
//		사용자 입력 -> main의 지역변수 -> 클래스의 생성자로 전달 -> 객체의 멤버 필드에 저장 -> 객체를 배열에 저장
		
		String name;
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		
//		Student st = new Student(sc.nextLine(), 
//								Integer.parseInt(sc.nextLine()), 
//								Integer.parseInt(sc.nextLine()), 
//								Integer.parseInt(sc.nextLine()));
		
		System.out.print("이름 입력 : "); name = sc.nextLine();
		System.out.print("국어 입력 : "); kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 입력 : "); eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 입력 : "); mat = Integer.parseInt(sc.nextLine());
		
		Student st = new Student(name, kor, eng, mat);
		
		System.out.println("이름은 " + st.name + "이고, 평균은 " + st.avg + "입니다");
		
		System.out.println(st);
		
	}
}
