package accessModifier;

class Food {
	private String name;
	private int price;
	
	public Food(String name, int price) {		
		this.name = name;
		this.price = price;
	}
	
	public Food() {}
	
	// private 필드의 getter / setter를 자동으로 작성하기
	// source - generate getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
}


public class Ex03 {
	public static void main(String[] args) {
		// 클래스 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고
		// 각 객체의 이름과 가격을 printf()을 이용하여 같은 서식으로 출력하세요
		
//		Food f1 = new Food("돈까스", 8500);
//		Food f2 = new Food("초밥", 9000);		
//		
//		System.out.printf("오늘 점심은 %s이며, 가격은 %,d원 입니다\n", f1.getName(), f1.getPrice());
//		System.out.printf("오늘 저녁은 %s이며, 가격은 %,d원 입니다\n", f2.getName(), f2.getPrice());
		
		Food f1 = new Food();
		Food f2 = new Food();
		
		f1.setName("돈까스");
		f1.setPrice(8500);	
		
		f2.setName("초밥");
		f2.setPrice(9000);
		
		System.out.printf("오늘 점심은 %s이며, 가격은 %,d원 입니다\n", f1.getName(), f1.getPrice());
		System.out.printf("오늘 저녁은 %s이며, 가격은 %,d원 입니다\n", f2.getName(), f2.getPrice());
		
	}
}
