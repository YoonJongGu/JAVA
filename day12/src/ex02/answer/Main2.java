package ex02.answer;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// Main2 에서는 handler를 사용하지 않고 모든 내용을 main에서 처리한다
		// handler가 없다면 데이터를 저장할 배열도 main에 있어야 한다
		
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		String name, result;			// 출력할 결과는 문자열 형태의 result
		int kor, eng, mat, row, select;	// 함수의 처리 결과를 보고받는 정수형 row
		Student ob;
		
		do {
			System.out.println("1. 목록 | 2. 추가 | 3. 검색 | 4. 수정 | 5. 삭제 | 0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				result = "";
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						result += arr[i].toString() + "\n";
					}
				}
				System.out.println(result);
				break;
				
			case 2:
				System.out.print("이름 입력 : "); name = sc.nextLine();
				System.out.print("국어 입력 : "); kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 입력 : "); eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 입력 : "); mat = Integer.parseInt(sc.nextLine());
				ob = new Student(name, kor, eng, mat);
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {
						arr[i] = ob;
						break;
					}
				}
				break;
			case 3:	// 검색
				// 1. 검색어를 입력받는다
				System.out.print("검색할 학생의 이름 입력 : ");
				name = sc.nextLine();
				
				// 2. 배열에서 검색어와 일치하는 이름을 가진 객체를 찾는다
				result = "결과를 찾을 수 없습니다";
				for(int i = 0 ; i < arr.length; i++) {
					if(arr[i] != null && arr[i].name.equals(name)) {
						result = arr[i].toString();
						break;
					}
				}
				
				// 3. 찾은 객체의 정보를 출력한다
				System.out.println(result);
				break;
				
				
			case 4:break;
			case 5:break;
			}
			
			System.out.println();
		} while(select != 0);
		sc.close();
	}
}
