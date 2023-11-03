package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws IOException {
		// C:\\20221110\\e.txt 파일을 생성하고
		// Scanner를 이용하여 키보드로 문자열을 입력받아서
		// 입력받은 문자열을 대상 파일에 기록하는 코드를 작성하세요
		// 단, 파일에 기록이 이루어질때마다 현재 시간을 기록하게 하고
		// 내용이 변경되는 것이 아니라 추가되게끔 설정해보세요
		
		// 표준 입력 -> 프로그램 -> 파일 출력
		Scanner sc = new Scanner(System.in);
		String now = new SimpleDateFormat("hh시 mm분 ss초").format(new Date());
		File f = new File("C:\\20221110", "e.txt");
		// true, false 여부에 따라 true는 내용추가 / false는 덮어쓰기
		FileOutputStream fos = new FileOutputStream(f, true);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
					
		System.out.print("문자열 입력 : ");		
		osw.append(sc.nextLine() + "\n");
		osw.append(now + "\n\n");
		osw.flush();
		osw.close();
		
		System.out.println("끝");
		sc.close();
	}
}
