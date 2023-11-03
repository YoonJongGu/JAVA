package management;

import java.util.Scanner;

import model.ComputerScienceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {	
	
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {
		Student st = null;
		Scanner sc = new Scanner(System.in);
		int select, row, index;
		String name;
		
		System.out.printf("\n\t 학생 관리 프로그램\n");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 삭제(index를 활용한 삭제)");
			System.out.println("0. 종료");
			System.out.print(">>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.print("학생 유형을 선택하세요 (1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1) st = makeEnglishLinguisticStudent(sc);
				if(select == 2) st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달해서 일치하는 학생을 찾기
				if(st != null)	st.showDetail();
				else			System.out.println(name + "학생을 찾을 수 없습니다");
				break;
				
			case 4:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);
				if(st == null) {
					break;
				}
				row = handler.delete(st);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 5:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				index = handler.indexOf(name);
				if(index == -1) {
					System.out.println("이름이 일치하는 학생이 없습니다");
					break;
				}
				row = handler.delete(index);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
				
			}
			
		} while(select != 0);
		System.out.println("프로그램을 종료합니다");
		sc.close();
		
	}
	
	static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int kor, eng, mat, literature, translation;
		
		System.out.print("이름 : ");
		name = sc.nextLine();		
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 : ");
		mat = Integer.parseInt(sc.nextLine());
		
		System.out.print("문학 : ");
		literature = Integer.parseInt(sc.nextLine());
		
		System.out.print("번역 : ");
		translation = Integer.parseInt(sc.nextLine());
		
		EnglishLinguisticStudent ob = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);

		return ob;
	}

	static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int kor, eng, mat, java, network, linux;
		
		System.out.print("이름 : ");
		name = sc.nextLine();		
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 : ");
		mat = Integer.parseInt(sc.nextLine());
		
		System.out.print("자바 : ");
		java = Integer.parseInt(sc.nextLine());
		
		System.out.print("네트워크 : ");
		network = Integer.parseInt(sc.nextLine());
		
		System.out.print("리눅스 : ");
		linux = Integer.parseInt(sc.nextLine());

		ComputerScienceStudent ob = new ComputerScienceStudent(name, kor, eng, mat, java, network, linux);
		
		return ob;
	}
}
