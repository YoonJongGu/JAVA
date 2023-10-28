package day05;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		String id = "itbank";
		String pw = "it";
		
		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 userid, userpw를 입력받고,
		System.out.print("아이디 입력 : ");
		userid = sc.nextLine();
		System.out.print("패스워드 입력 : ");
		userpw = sc.nextLine();		
		if(userid.equals(id)) {	// ID가 일치하면
			if(userpw.equals(pw)) {	// PW가 일치하면
				// ID/PW 모두 일치하면 [로그인 성공]
				System.out.println("로그인 성공");
			}
			else {
				// ID는 일치하지만 PW가 일치하지 않으면 [비밀번호 오류]
				System.out.println("비밀번호 오류");
			}
		}
		else {
			// ID가 일치하지 않으면 [계정을 찾을 수 없습니다] 라고 출력하세요
			System.out.println("계정을 찾을 수 없습니다");
		}
		
		sc.close();
	}
}
