package book;

import java.util.Scanner;

public class Main {
	
	static BookDAO dao;
	
	public static void main(String[] args) {
		
		BookDTO[] arr = {
				new BookDTO("트렌드 코리아 2023", "김난도", "미래의창", 17100, 4, 4),	
				new BookDTO("아버지의 해방일지", "정지아", "창비", 13500, 4.1, 4.2),	
				new BookDTO("주술회전 20 더블특장판", "아쿠타미 게게", "서울미디어코믹스", 5400, 0, 0),	
			};
			
		dao = new BookDAO(arr);
		
		int menu;
		BookDTO dto;		
		Scanner sc = new Scanner(System.in);
		int row = 0;		
		String result;
		String name;
		
		do {
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록");
			System.out.println("3. 목록 삭제");
			System.out.println("4. 도서 검색");
			System.out.println("5. 목록 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				dto = input(sc);
				row = dao.insert(dto);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
			case 2:				
				result = dao.getList();
				System.out.println(result);
				break;
			case 3:	
				System.out.print("어떤 값으로 삭제합니까 (1. 번호 | 2. 제목) : ");
				menu = Integer.parseInt(sc.nextLine());
				row = delete(sc, menu);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			case 4:
				System.out.print("도서명 검색 : ");
				name = sc.nextLine();
				result = dao.search(name);
				System.out.println(result);
				break;
			case 5:
				System.out.println("도서명으로 오름차순 정렬");
				result = dao.sort();
				System.out.println(result);
				break;
			}
			
		} while(menu != 0);
		System.out.println("=== 프로그램 종료 ===");
		sc.close();
		
	}
	
	static BookDTO input(Scanner sc) {
		String name;
		String author;
		String publisher;
		int price;
		double starPoint1;
		double starPoint2;
		
		System.out.print("도서명 : ");
		name = sc.nextLine();
		
		System.out.print("지은지 : ");
		author = sc.nextLine();
		
		System.out.print("출판사 : ");
		publisher = sc.nextLine();
		
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("별점1 : ");
		starPoint1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("별점2 : ");
		starPoint2 = Double.parseDouble(sc.nextLine());
		
		BookDTO dto = new BookDTO(name, author, publisher, price, starPoint1, starPoint2);
		return dto;
		
	}
	
	static int delete(Scanner sc, int menu) {
		int index, row = 0;
		String name;
		if(menu == 1) {
			System.out.print("도서 번호를 입력하세요 : ");
			index = Integer.parseInt(sc.nextLine());
			row = dao.delete(index);
		}
		else if(menu == 2) {
			System.out.print("도서 제목을 입력하세요 : ");
			name = sc.nextLine();
			row = dao.delete(name);
		}
		else {
			System.out.println("메뉴 선택이 잘못되었습니다. 다시 시도해주세요");
		}		
		return row;
	}

}
