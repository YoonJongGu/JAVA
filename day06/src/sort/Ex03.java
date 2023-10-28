package sort;

public class Ex03 {
	public static void main(String[] args) {
		// 두 변수의 값을 교환하기
		
		int n1 = 10, n2 = 20;		
//		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
//		int tmp = n1;
//		n1 = n2;
//		n2 = tmp;
//		
//		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
				
		exChangeInt(n1, n2);
		System.out.println();
		exChangeInt(25, 40);		
	}
	
	static void exChangeInt(int n1, int n2) {
		System.out.printf("변경 전 => n1 : %d, n2 : %d\n", n1, n2);
		int tmp = n1;
		n1 = n2;
		n2 = tmp;
		System.out.printf("변경 후 => n1 : %d, n2 : %d\n", n1, n2);
	}
}
