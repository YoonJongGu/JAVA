package chicken;

import java.util.Scanner;

public class Main {
	// main 함수 안에 있던 지역변수를 Main 클래스의 멤버 필드로 변경
	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		// 사용자와 입출력으로 상호작용하면서 프로그램을 진행하는 코드
		
		int menu;
		Scanner sc = new Scanner(System.in);
	
		int result = 0;
		
		do {
			System.out.println("1. 메뉴추가");
			System.out.println("2. 메뉴목록");
			System.out.println("0. 종료");
			System.out.print("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				Chicken ob = input(sc);
				result = handler.insert(ob);
				System.out.println(result == 1? "추가 성공 " : "추가 실패");
				break;
			case 2:
				handler.show();
				break;			
			}
			
		} while(menu != 0);
		System.out.println("=== 프로그램 종료 ===");
		sc.close();
	}	// end of main
	
	static Chicken input(Scanner sc) {
		String brand, store, menu;
		int price;
		double starPoint;
		
		System.out.print("브랜드 : ");
		brand = sc.nextLine();
		
		System.out.print("점포명 : ");
		store = sc.nextLine();
		
		System.out.print("메뉴이름 : ");
		menu = sc.nextLine();
		
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("별점 : ");
		starPoint = Double.parseDouble(sc.nextLine());
		
		Chicken ob = new Chicken(brand, store, menu, price, starPoint);
		return ob;
		
	}
}
