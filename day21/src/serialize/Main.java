package serialize;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Handler handler = new Handler();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Scanner sc = new Scanner(System.in);		
		Todo todo;
		int select, row;
		String title;
		Date date;		
		
		do {
			System.out.println("\n");
			System.out.println("1. 추가");
			System.out.println("2. 삭제");
			System.out.println("3. 목록");
			System.out.println("4. 정렬(날짜)");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				System.out.print("제목 입력 : ");
				title = sc.nextLine();
				System.out.print("날짜 입력 : ");
				date = sdf.parse(sc.nextLine());
				todo = new Todo(title, date);
				row = handler.insert(todo);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 2:
				System.out.print("제목 입력 : ");
				title = sc.nextLine();
				System.out.print("날짜 입력 : ");
				date = sdf.parse(sc.nextLine());
				todo = new Todo(title, date);
				row = handler.delete(todo);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			
			case 3:
				handler.showList();
				break;
				
			case 4:
				handler.sortByDate();
				handler.showList();
				break;
				
			case 0:
				handler.save();
				System.out.println("저장 성공 !!");
				break;
				
			}
			
		} while(select != 0);
		System.out.println("프로그램 종료");
		sc.close();		
	}
}
