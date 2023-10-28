package card;

public class Card {
	char type;	// 다이아, 스페이드, 클로버, 하트
	String num;	// A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
	
	int width = 7;	// 카드의 너비
	int height = 5;	// 카드의 높이
	
	Card(char type, String num) {	// 생성자
		this.type = type;
		this.num = num;
	}
	
	void show() {	// 카드 출력 함수
		String[][] arr = new String[height][width];		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0 && j == 0) {
					arr[i][j] = "┌";
				}				
				else if(i == height - 1 && j == width - 1) {
					arr[i][j] = "┘";
				}
				else if(i == 0 && j == width - 1) {
					arr[i][j] = "┐";
				}
				else if(i == height - 1 && j == 0) {
					arr[i][j] = "└";
				}
				else if(j == 0 || j == width - 1){
					arr[i][j] = "│";
				}
				else if(i == 0 || i == height - 1){
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
		Card c1 = new Card('♠', "9");
		
		c1.show();
	}
}
