package student;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler handler = new Handler();	// 생성자에서 파일을 읽어들인다		
//		handler.showList();
		
		int select, kor, eng, mat;
		String name;
		Scanner sc = new Scanner(System.in);
		Student st;
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬(이름)");
			System.out.println("5. 정렬(합계)");
			System.out.println("6. 정렬(평균)");
			System.out.println("0. 종료");			
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.print("이름 : ");		name = sc.nextLine();
				System.out.print("국어점수 : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어점수 : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학점수 : ");	mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
			
			case 3:
				System.out.print("삭제할 이름 검색 : ");		name = sc.nextLine();
				handler.delete(name);				
				break;
			
			case 4:
				handler.sortByName();
				System.out.println("정렬 완료 !!");
				break;
			
			case 5:
				handler.sortBySum();
				System.out.println("정렬 완료 !!");
				break;
				
			case 6:
				handler.sortByAvg();
				System.out.println("정렬 완료 !!");
				break;
				
			case 0:
				handler.save();	// 메인이 종료되기 직전 저장한다
				sc.close();
				break;
			}
			
		} while(select != 0);
		
		
	}
}
