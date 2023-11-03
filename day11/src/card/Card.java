package card;

public class Card {
	char type;	// 다이아, 스페이드, 클로버, 하트
	String num;	// A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
	
	static int width;	// 카드의 너비
	static int height;	// 카드의 높이
	
	static void setSize(int width, int height) {
		// static method에서는 객체가 생성되지 않은 상태
		// this를 사용할 수 없다
		Card.width = width;
		Card.height = height;
	}
	
	Card(char type, String num) {	// 생성자
		this.type = type;
		this.num = num;
	}
	
	static void show(Card cd) {	// 카드 출력 함수
		int tmp = width + 2;
		String[][] arr = new String[height][cd.num.length() == 2 ? tmp : width];		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0 && j == 0) {
					arr[i][j] = "┌";
				}				
				else if(i == arr.length - 1 && j == arr[i].length - 1) {
					arr[i][j] = "┘";
				}
				else if(i == 0 && j == arr[i].length - 1) {
					arr[i][j] = "┐";
				}
				else if(i == arr.length - 1 && j == 0) {
					arr[i][j] = "└";
				}
				else if(i == 2 && j == 1 || i == arr.length - 3 && j == arr[i].length - 2) {
					arr[i][j] = cd.type + "";
				}
				else if(i == 1 && j == 1 || i == arr.length - 2 && j == arr[i].length - 2) {
					arr[i][j] = cd.num;
				}
				else if(j == 0 || j == arr[i].length - 1){
					arr[i][j] = "│";
				}
				else if(i == 0 || i == arr.length - 1){
					arr[i][j] = "─";
				}
				else {
					arr[i][j] = " ";
				}
				
			}		
		
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// 모든 객체가 같은 값을 공유하게 하려면 static
		Card.setSize(13, 11);
		// 객체마다 서로 다른 값을 가지게 하려면 non-static
		Card c1 = new Card('♠', "9");
//		Card c2 = new Card('♥', "10");
		Card c3 = new Card('♣', "J");
//		Card c4 = new Card('◆', "A");
		Card c5 = new Card('♠', "K");
		
		Card.show(c1);
//		Card.show(c2);
		Card.show(c3);
//		Card.show(c4);
		Card.show(c5);
		
	}
}
