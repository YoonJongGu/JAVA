package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();;
		Student ob;
		int select, row, check_k, check_e, check_m;
		int kor = 0, eng = 0, mat = 0;
		String result , name;
		String[] score = new String[3];
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 단일검색(이름)");
			System.out.println("4. 수정(이름)");
			System.out.println("5. 삭제(이름)");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:	// 목록
				result = hd.selectAll();
				System.out.println(result);
				break;
				
			case 2:	// 추가
				ob = input(sc);
				row = hd.insert(ob);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:	// 검색
				System.out.print("검색할 이름 입력 : ");
				name = sc.nextLine();
				result = hd.search(name);
				System.out.println(result);
				break;
				
//			case 4:	// 수정
//				ob = input(sc);
//				row = hd.update(ob);				
//				System.out.println(row == 1 ? "수정 성공" : "수정 실패");
//				break;
				
			case 4: // 수정
				System.out.print("수정할 이름 입력 : ");
				name = sc.nextLine();
				System.out.print("수정을 원하는 과목 입력 : ");
				score = sc.nextLine().split(",");
				check_k = update(score, "국어");
				check_e = update(score, "영어");
				check_m = update(score, "수학");
				if(check_k == 1) {						
					System.out.print("국어 점수 입력 : ");
					kor = Integer.parseInt(sc.nextLine());
				}
				
				if(check_e == 1) {
					System.out.print("영어 점수 입력 : ");
					eng = Integer.parseInt(sc.nextLine());
				}
				
				if(check_m == 1) {
					System.out.print("수학 점수 입력 : ");
					mat = Integer.parseInt(sc.nextLine());
				}
				row = hd.update(name, kor, eng, mat);
				System.out.println(row == 1 ? "수정 성공" : "수정 실패");					
				break;
				
			case 5:	// 삭제
				System.out.print("수정할 이름 입력 : ");
				name = sc.nextLine();
				row = hd.delete(name);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			
			}		
			
		} while(select != 0);
		sc.close();
	}// end of main
	
	static Student input(Scanner sc) {
		String name;
		int kor, eng, mat;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 : ");
		mat = Integer.parseInt(sc.nextLine());
		
		Student ob = new Student(name, kor, eng, mat);		
		return ob;
	}
	
	static int update(String[] arr, String str) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains(str)) {
				return 1;
			}
		}		
		return 0;
	}
}
