package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException_oper extends Exception {

	private static final long serialVersionUID = 1L;
	
}

class MyException_int extends Exception {

	private static final long serialVersionUID = 1L;	
	
}

public class Ex05 {
	
	static boolean isOper(char oper) {
		if(oper == '+') return true;
		if(oper == '-') return true;
		if(oper == '*') return true;
		if(oper == '/') return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyException_oper ex_o;
		MyException_int ex_i;
		Long n1, n2;
		Long result = null;
		char oper;
		
		// 두 정수와 연사자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 확인하여 try ~ catch 구문으로 작성하세요
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다
		
		try {
			System.out.print("정수1 입력 : ");
			n1 = Long.parseLong(sc.next());
			System.out.print("연산자 입력 : ");
			oper = sc.next().charAt(0);
			if(isOper(oper) == false) {
				 ex_o = new MyException_oper();
				 throw ex_o;
			}
			System.out.print("정수2 입력 : ");
			n2 = Long.parseLong(sc.next());
			
			if(oper == '+') result = n1 + n2;
			if(oper == '-') result = n1 - n2;
			if(oper == '*') result = n1 * n2;
			if(oper == '/') result = n1 / n2;			
			
			if(result > 2147483647L || -2147483648L > result) {
				ex_i = new MyException_int();
				throw ex_i;
			}
			
			System.out.printf("%d %c %d = %d", n1, oper, n2, result);	
			
		} catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		
		} catch(MyException_oper e) {
			System.out.println("연산 기호만 입력이 가능합니다");
			
		} catch(MyException_int e) {
			System.out.println("정수형 범위를 벗어났습니다");
			
		} catch(Exception e) {		// 모든 예외를 받아서
			e.printStackTrace();	// 예외 발생 현황을 추적하면서 출력한다 (기본값)
			
		} finally {
			sc.close();
		}		
	}
}
