package exception;

class Test6 {
	
	// 현재 메서드 내부에서 발생하는 NullPointerException을 caller에게 전가시킨다
	void method1() throws NullPointerException {
		String str = null;
//		try {
			System.out.println(str.charAt(0));
//		} catch(NullPointerException e) {
//			System.out.println("null값에 대한 메서드를 호출할 수 없습니다");
//		}
	}
	
	void method2() throws ArrayIndexOutOfBoundsException {
		int[] arr = { 2, 7, 8, 4, 6 };
//		try {
			System.out.println(arr[5]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 인덱스는 길이보다 작아야 합니다");
//		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		// throws : 현재 함수에서 발생한 예외의 처리를 caller에게 전가시킨다
		
		Test6 ob = new Test6();
//		try {
//			ob.method1();	// throws NullPointerException (런타임 예외라서 처리안해도 실행 가능)
//		} catch(NullPointerException e) {
//			System.out.println("NullPointerException");
//		}
		
		try {
			Thread.sleep(1000);	// throws InterruptedException (런타임 예외가 아니라서 의무적으로 처리)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			ob.method2();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}
