package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		// 텍스트 파일에 문자열 기록하기
		
		File f = new File("C:\\20221110", "c.txt");
		FileOutputStream fos = new FileOutputStream(f);
		
		String test = "Hello, World !!\n";
		test += "안녕하세요\n";
		
		fos.write(test.getBytes());	// 파일에 데이터를 기록할 때는 바이트 단위로 쪼개서 전달해야 한다
		fos.flush();				// 출력버퍼에 남아있는 데이터를 파일로 밀어넣는다
		fos.close();
		
		System.out.println("끝");
	}
}
