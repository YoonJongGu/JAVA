package day01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리 연산에 의한 연산 미수행
		int n1 = -1, n2 = 0, n3 = 1, n4 = 2;
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		boolean flag1 = n1++ + ++n2 < 0 && n3-- * ++n4 == 0;
		// && 연산자의 경우 처음 조건에서 거짓이 나온다면 이후의 조건식은 판별하지 않고 거짓을 낸다.
		System.out.println(flag1);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);		
		
		boolean flag2 = n1++ + ++n2 > 0 || n3-- * ++n4 == 0;
		// || 연산자의 경우 처음 조건에서 참이 나온다면 이후의 조건식은 판별하지 않고 참을 낸다. 
		System.out.println(flag2);		
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
	}
}
