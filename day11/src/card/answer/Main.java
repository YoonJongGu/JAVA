package card.answer;

public class Main {
	public static void main(String[] args) {
		
		// 모든 객체가 같은 값을 공유하게 하려면 static
		CardAnswer.setSize(10, 13);
		
		// 객체마다 서로 다른 값을 가지게 하려면 non-static
		CardAnswer ob1 = new CardAnswer("♥", "5");
		CardAnswer ob2 = new CardAnswer("♠", "A");
		CardAnswer ob3 = new CardAnswer("♣", "7");
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
