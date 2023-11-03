package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException {
		Movie[] data = {
				new Movie("블랙아담", "자움 콜렛 세라", "드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 스원들".split(","),
							"액션", 125, sdf.parse("2022-10-19"), 7.63),
				new Movie("공조2: 인터네셔날", "이석훈", "현빈,유해진,윤아,다니엘 헤니".split(","),
							"액션", 129, sdf.parse("2022-09-07"), 8.08),
				new Movie("인생은 아름다워", "최국희", "류승용,염정아,박세완,옹성우".split(","),
							"뮤지컬", 122, sdf.parse("2022-09-28"), 8.36)
		};
		
		Handler.arr[0] = data[0];	// static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다
		Handler.arr[1] = data[1];
		Handler.arr[2] = data[2];
	}
	
	public static void main(String[] args) throws ParseException {		
		prepareDummy();
		
		Scanner sc = new Scanner(System.in);
		
		int menu, row;
		String result, keyword;
		
		do {
			System.out.println("1) 영화 목록");
			System.out.println("2) 영화 추가");
			System.out.println("3) 단일 검색");
			System.out.println("4) 다중 검색");
			System.out.println("5) 영화 삭제");
			System.out.println("0) 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:				
				System.out.println(Handler.getList());
				break;
			case 2:
				Movie ob = input(sc);
				row = Handler.insert(ob);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
			case 3:
				System.out.print("키워드 입력 : ");
				keyword = sc.nextLine();
				result = Handler.search(keyword);
				System.out.println(result);
				break;
			case 4:
				System.out.print("키워드 입력 : ");
				keyword = sc.nextLine();
				result = Handler.searchList(keyword);
				System.out.println(result);
				break;
			case 5:
				System.out.println(Handler.getList());
				System.out.print("어떤 값으로 삭제합니까 (1. 번호 | 2. 제목) : ");
				menu = Integer.parseInt(sc.nextLine());				
				row = delete(sc, menu);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			}
			
		} while(menu != 0);	
		sc.close();		
	} // end of main
	
	static Movie input(Scanner sc) throws ParseException {
		String title;		// 제목
		String director;	// 감독
		String[] actors;	// 배우
		String genre;		// 장르
		int runningTime;	// 러닝타임
		Date openningDate;	// 개봉일자
		double grade;		// 평점
		
		System.out.print("영화 제목 : ");
		title = sc.nextLine();
		
		System.out.print("영화 감독 : ");
		director = sc.nextLine();
		
		System.out.print("영화 배우 : ");
		actors= sc.nextLine().split(",");		
		
		System.out.print("영화 장르 : ");
		genre = sc.nextLine();
		
		System.out.print("영화 러닝타임 : ");
		runningTime = Integer.parseInt(sc.nextLine());
		
		System.out.print("영화 개봉일자 (yyyy-MM-dd): ");		
		openningDate = sdf.parse(sc.nextLine());
		
		System.out.print("영화 평점 : ");
		grade = Double.parseDouble(sc.nextLine());
		
		Movie dto = new Movie(title, director, actors, genre, runningTime, openningDate, grade);
		return dto;
	}
	
	static int delete(Scanner sc, int menu) {
		int idx, row = 0;
		String keyword;
		if(menu ==  1) {
			System.out.print("목록 번호 입력 : ");
			idx = Integer.parseInt(sc.nextLine());
			row = Handler.delete(idx);
			
		}
		else if(menu == 2) {
			System.out.print("영화 제목 입력 : ");
			keyword = sc.nextLine();
			row = Handler.delete(keyword);
		}
		else {
			System.out.println("메뉴 선택이 잘못되었습니다. 다시 시도해주세요");
		}
		return row;
	}
}
