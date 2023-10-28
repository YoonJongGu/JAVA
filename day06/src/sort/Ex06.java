package sort;

import java.util.Arrays;	// 배열을 제어하기 위해 도움이 되는 함수들이 모여있는 클래스

public class Ex06 {
	
	static void showArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 7, 8, 4, 6 };
		showArray(arr);
		
		Arrays.sort(arr);	// 별도의 객체를 생성하지 않아도, 정렬 함수를 호출할 수 있다(static)
		showArray(arr);		
		
	}
}
