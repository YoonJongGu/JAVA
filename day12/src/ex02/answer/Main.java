package ex02.answer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 사용자의 입력을 받아서 객체를 생성(이름, 국어, 영어, 수학)하고 핸들러에게 전달하고 결과를 출력
		// 사용자의 입력에 따라 핸들러가 반환하는 정보를 출력 (전체, 단일검색)
		// 사용자 입력에 따라 기존 객체를 찾아서 점수를 수정하고 결과를 출력
		// 사용자 입력에 따라 기존 객체를 찾아서 삭제하고 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		String name, result;			// 출력할 결과는 문자열 형태의 result
		int kor, eng, mat, row, select;	// 함수의 처리 결과를 보고받는 정수형 row
		Student ob;
		
		do {
			System.out.println("1. 목록 | 2. 추가 | 3. 검색 | 4. 수정 | 5. 삭제 | 0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				result = hd.selectAll();
				System.out.println(result);
				break;
				
			case 2:
				System.out.print("이름 입력 : "); name = sc.nextLine();
				System.out.print("국어 입력 : "); kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 입력 : "); eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 입력 : "); mat = Integer.parseInt(sc.nextLine());
				ob = new Student(name, kor, eng, mat);	// 입력받은 값으로 새로운 객체를 하나 생성
				
				System.out.println(ob);
				
				row = hd.insert(ob);
				if(row == 1) System.out.println("추가 성공");
				if(row == 0) System.out.println("추가 실패");
				break;
				
			case 3:
				// 1. 검색어를 입력받는다
				System.out.print("검색할 학생의 이름 입력 : ");
				name = sc.nextLine();
				// 2. 검색어를 이용하여 (핸들러 안에 있는) 배열에서 결과를 가져온다
				result = hd.search(name);
				// 3. 결과를 출력한다
				System.out.println(result);
				break;
				
			case 4:
				System.out.print("수정할 학생의 이름 입력 : ");
				name = sc.nextLine();
				System.out.print("국어 입력 : "); kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 입력 : "); eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 입력 : "); mat = Integer.parseInt(sc.nextLine());
				
				row = hd.update(name, kor, eng, mat);
				
				if(row == 1)  System.out.println("수정 성공");
				if(row == 0)  System.out.println("수정 실패");
				
				break;
			case 5:
				System.out.print("삭제할 학생의 이름 입력 : ");
				name = sc.nextLine();
				
				row = hd.delete(name);
				if(row == 1)  System.out.println("삭제 성공");
				if(row == 0)  System.out.println("삭제 실패");
				
				break;
			}
			
			System.out.println();
		} while(select != 0);
		sc.close();
	}
}
