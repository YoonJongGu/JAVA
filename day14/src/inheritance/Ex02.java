package inheritance;

class Pos {	// 2차원 좌표를 표현할 수 있는 객체를 만들기 위한 클래스 Pos
	int x;
	int y;
	
	// 생성자
	// 반환형이 Pos이며 함수명도 Pos이기 때문에 따로 반환을 하지않으며 반환형을 지정하지 않는다
	// 클래스명과 같은 이름을 가진다
	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPos() {
		System.out.printf("x : %d, y : %d\n", x, y);
	}
}

//class Pos3D {		// 상속을 사용하지 않고, 3차원의 좌표를 표현하기 위한 클래스를 작성
//	int x;
//	int y;
//	int z;
//	
//	Pos3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;		
//	}
//	
//	void showPos() {
//		System.out.printf("x : %d, y : %d, z : %d\n", x, y, z);
//	}
//	
//}

class Pos3D extends Pos {
	// 1) 특성(속성, 기능)을 물려주는 클래스를 부모 클래스, 슈퍼 클래스, 상위 클래스라고 한다
	// 2) 특성(속성, 기능)을 물려받는 클래스를 자식 클래스, 서브 클래스, 하위 클래스라고 한다
	// 3) extends 는 확장하다 라는 뜻이다. 슈퍼 클래스의 개념을 더욱 확장한 새로운 클래스를 말한다
	// 4) 서브클래스는 슈퍼클래스의 생성자를 호출해야 객체를 생성할 수 있다
	// 5) 이때, 명시되지 않으면 슈퍼클래스의 기본생성자를 호출하게 된다
	// 6) 서브클래스의 생성자에서 슈퍼클래스의 생성자를 호출하려면 this 대신 super를 사용한다
	// 7) 상속받은 메서드의 형식을 그대로 유지하면서 내용만 새로 작성할 수 있다 (오버라이딩)
	
//	int x;	// Pos 클래스에서 물려받아서 안보이지만 가지고 있음
//	int y;	// Pos 클래스에서 물려받아서 안보이지만 가지고 있음
	int z;
	
	Pos3D(int x, int y, int z) {
		super(x, y);	// Pos(x, y)
		this.z = z;
	}
	
//	void showPos() {	// Pos 클래스에서 물려받아서 안보이지만 가지고 있음
//		System.out.printf("x : %d, y : %d\n", x, y);
//	}
	
	@Override			// 이 함수는 오버라이딩 되었습니다
	void showPos() {	// 상속받은 메서드와 형식이 일치하고, 내용은 새로 작성되었습니다
		System.out.printf("x : %d, y : %d, z : %d\n", x, y, z);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Pos ob1 = new Pos(2, 3);
		ob1.showPos();
		
		Pos3D ob2 = new Pos3D(5, 8, 7);
		ob2.showPos();
	}
}
