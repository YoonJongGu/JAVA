package test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler handler = new Handler();	
		int select;
		String name, birth;
		Scanner sc = new Scanner(System.in);
		Person p;
		
		handler.load();
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬(이름순)");
			System.out.println("5. 정렬(합계)");
			System.out.println("0. 종료");			
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.print("이름 : ");					name = sc.nextLine();
				System.out.print("생년월일(xxxx년x월x일) : ");	birth = sc.nextLine();				
				p = new Person(name, birth);
				handler.insert(p);
				break;
			
			case 3:
				System.out.print("삭제할 이름 검색 : ");		name = sc.nextLine();
				handler.delete(name);				
				break;
			
			case 4:
				handler.sortName();
				System.out.println("정렬 완료 !!");
				break;
			
			case 5:
				handler.sortBirth();
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
