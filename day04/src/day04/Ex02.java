package day04;

public class Ex02 {
	// y = f(x)	
	static int getMaxNum(int a1, int a2, int a3) {
		int max = a1;
		if(max < a2) max = a2;
		if(max < a3) max = a3;
		return max;
	}
	
	static int getReverseNumber(int b1) {
		int b2 = 0;
		while(b1 != 0) {
			b2 *= 10;
			b2 += b1 % 10;
			b1 /= 10;
		}
		return b2;		// 반복문 안에서 return을 수행하면 반복문과 상관없이 함수가 즉각 종료된다
	}
	
/*
//	static int getFee(int c1) {
//		int fee = 3000;
//		if(c1 > 30) {
//			if(c1 % 10 == 0) {
//				fee = fee + 500 * (c1 - 30) / 10; 
//			}
//			else {
//				fee = fee + 500 * ((c1 - 30) / 10 + 1);
//			}
//		}
//		
//		return fee;
//	}
*/	
	
	static int getFee(int time) {
		int over = ((time - 21) / 10) * 500;
		return time > 30 ? 3000 + over : 3000;
		// 삼항 연산은 값을 결정하고, return 은 값을 반환하기 때문에
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있다
	}
	
	static int getSummary(int d1, int d2) {
//		int result = 0;
//		for(int i = d1; i <= d2; i++) {
//			result += i;
//		}
//		return result;
		return (d1 + d2) * (d2 - d1 + 1) / 2;
	}
	
	public static void main(String[] args) {		
		
		// 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요
		int n1 = getMaxNum(2, 5, 3);
		System.out.println("n1 : " + n1);
		
		// 2) 정수를 전달받아서, 정수를 꺼꾸로 뒤집은 값을 반환하는 함수를 작성하세요 (while)
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : " + n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요 (if)
		int n3 = getFee(40);
		System.out.println("n3 : " + n3);
		
		// 4) 두 정수 a, b를 전달받아서 a와 b사이의 모든 합계를 반환하는 함수를 작성하세요 (for)
		int n4 = getSummary(1, 100);
		System.out.println("n4 : " + n4);
		
	}
}
