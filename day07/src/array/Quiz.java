package array;

public class Quiz {
	
	static void guide(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();	
	}
	
	public static void main(String[] args) {
		
		int length = 5;
		int[][] arr = new int[length][length];		
		int x = -1;
		int y = 0;
		int sign = 1;								// 이후 부호 반전을 위해 sign 변수 생성
		int num = 1;
		
		// 해당 문제의 핵심
		// 반복되는 규칙과 요소를 확인하기 위해 나열해보고,
		// 반복되는 값을 변수로 사용하고,
		// 반복되는 식을 줄여주고,
		// 반복을 제어하기 위한 조건을 넣어준다
		while(length > 0) {							// 반복 횟수를 통제하기 위한 length변수 
			for(int i = 0; i < length; i++) {		
				x += sign;							// x축 증가 / x축 감소
				arr[y][x] = num++;					// 해당 좌표값 1 증가
			}			
			length--;								// 반복 횟수를 감소
			if(length == 0) break;					// 조건문을 통해 반복을 종료 
			for(int i = 0; i < length; i++) {
				y += sign;							// y축 증가 / y축 감소
				arr[y][x] = num++;					// 해당 좌표값 1 증가
			}
			sign = -sign;							// 부호 반전
		}
		
		show(arr);
	}
}
