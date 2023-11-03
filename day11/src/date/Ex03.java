package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String input;
		Date start;
		long dayCount, st, et;
		
		System.out.print("날짜 입력 (yyyy-MM-dd) : ");
		input = sc.nextLine();
		System.out.print("몇일 : ");
		dayCount = Long.parseLong(sc.nextLine());
		
		start = sdf.parse(input);	// parse : 문자열을 Date로 변환해준다
		System.out.println(start);
		st = start.getTime();
		System.out.println(st);
		et = st + 60 * 60 * 24 * dayCount * 1000;
		System.out.println(et);
		// 60초 * 60분 * 24시간 * dayCount일 * 1000(millisecond)
		
		for(long i = st; i < et; i += (60 * 60 * 24 * 1000)) {
			Date d = new Date(i);
			System.out.println(d);
			String s = sdf2.format(d);	// format : Date을 문자열로 변환해준다
			System.out.println(s);
		}
		System.out.println("끝");
		sc.close();
		
		Date test = sdf.parse("1970-01-01");	// GMT + 0900
		System.out.println(test.getTime() + (60 * 60 * 9 * 1000));
	}
}
