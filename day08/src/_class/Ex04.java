package _class;

class Human {
	// 필드
	String name;
	int age;
	
	// 생성자
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드
	void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		String[] names = { "이지은", "홍진호", "강호동", "주호민", "이병건" };
		int[] ages = { 30, 41, 52, 42, 40 };
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s : %d살\n", names[i], ages[i]);
		}
		System.out.println();
		
		// 클래스를 활용한 코드
		Human h1 = new Human("이지은", 30);
		Human h2 = new Human("홍진호", 41);
		Human h3 = new Human("강호동", 52);
		Human h4 = new Human("주호민", 42);
		Human h5 = new Human("이병선", 40);
		
		Human[] arr = { h1, h2, h3, h4, h5 };
		
		// 이름과 나이가 하나의 객체게 모여있기 때문에, 나이를 기준으로 객체를 정렬하면
		// 이름은 자동으로 바뀌어 있다
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].age > arr[j].age) {
					Human tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
}
