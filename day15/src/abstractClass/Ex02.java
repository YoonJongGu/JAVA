package abstractClass;

abstract class Button {
	
	// abstract 메서드는 상속받아서 써야하기 때문에 private으로 지정할 수 없다
	// protected 혹은 public으로 설정해야 한다
	// protected : 패키지가 달라도 상속관계에 있으면 접근 가능
	// public : 패키지나 상속여부에 상관없이 누구나 접근 가능
	protected abstract void onClick();
	
	public void click() {
		this.onClick();
	}
}

class MessageButton extends Button {
	
	@Override
	protected void onClick() {
		System.out.println("Hello, World !!");
	}
}

class NotepadButton extends Button {

	@Override
	protected void onClick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "notepad";				// 실행할 명령어	
			Process pro = rt.exec(cmd);			// 실행 후 프로세스를 저장해두었다가
			Thread.sleep(200);					// 2초 후
			pro.destroyForcibly();				// 프로세스를 종료한다
			
		} catch(Exception e) {}
		
	}
	
}

class CalcButton extends Button {

	@Override
	protected void onClick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "calc";				// 실행할 명령어
			rt.exec(cmd);						// 명령어를 실행
			
		} catch(Exception e) {}
			
	}
	
	
}

public class Ex02 {
	public static void main(String[] args) {
//		Button btn1 = new Button();
		
		MessageButton btn2 = new MessageButton();
		btn2.click();
		
		NotepadButton btn3 = new NotepadButton();
		btn3.click();
		
		Button btn4 = new CalcButton();	// 서브 클래스의 객체를 슈퍼 클래스로 참조한다
		btn4.click();
		// 추상 클래스가 직접 객체를 생성할 수는 없지만, 자료형으로써 참조변수를 사용하는 것은 가능하다
		
		Button btn5 = new Button() {
			private String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
			private String url = " https://search.naver.com/search.naver?query=아이유";
			
			@Override
			protected void onClick() {
				try {
					Runtime rt = Runtime.getRuntime();
					cmd += url;					
					rt.exec(cmd);
				} catch(Exception e) {}
				
			}
		};
		btn5.click();
	}
}
