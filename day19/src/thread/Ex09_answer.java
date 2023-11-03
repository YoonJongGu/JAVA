package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Timer2 extends Object implements Runnable {
	
	private int second;
	private boolean over;
	
	public Timer2(int second) {
		this.second = second;
	}
	
	public void check() {
		for(int i = second; i != -1; i--) {
			System.out.printf("\t[%02d:%02d]\n", i / 60, i % 60);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		over = true;
	}
	
	public boolean isOver() {
		return over;
	}

	@Override
	public void run() {
		check();
	}
}

public class Ex09_answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		// 10초 동안 얼마나 많은 문자열을 입력할 수 있는지 확인하는 코드를 작성해보세요
		
		Timer2 timer = new Timer2(10);
		Thread th = new Thread(timer);
		th.start();
//		timer.check();
		
		while(timer.isOver() == false) {
			System.out.print("문자열 입력 : ");
			list.add(sc.nextLine());
		}
		
		// 10초가 지나면 지금까지 입력받은 모든 문자열을 한줄씩 출력합니다
		list.forEach(str -> System.out.println(str));
		sc.close();
		
	}
}
