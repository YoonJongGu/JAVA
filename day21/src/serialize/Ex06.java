package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Ex06 {
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("ex03.dat");
		
		// 웹 상의 이미지 주소를 작성
//		String path = "https://postfiles.pstatic.net/MjAyMDA4MzFfOCAg/MDAxNTk4ODU1NjMzODA5.THm9fdug87MMVwkGyDlyoRR3M5mNaNKIEsgXkiXKc8Yg.9hVXc4NmIl0aQ1bZWBQTBkF_SnO5NdDNLtA2UF8nJGcg.GIF.theworkscompany/22.gif?type=w966";
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA5MTBfMTQ2%2FMDAxNTk5NzAzODQwMDc0.67cyILR0PbwJtepFpUJXyOtQ0MlPeye9kX8JZs3SKfwg.p2zP0htAu99BAVpZXNTw7Zj3gRgTbgUmqhQ3vnRprsYg.GIF.theworkscompany%2F21.gif&type=sc960_832_gif";
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// 연결된 자원의 컨트롤 유형을 문자열 형태로 확인 할 수 있다
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		
		System.out.println("컨텐트 유형은 " + contentType + "입니다");
		System.out.print("원하는 파일 이름을 입력하세요 : ");
		fileName = sc.nextLine();
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		byte[] buffer = new byte[1024];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
		}
		
		fis.close();
		fos.close();
		sc.close();
	}
}
