package airplane;

public class Singer extends Human {
	Singer(String name) {
		super(name);
	}
	
	void show() {
		System.out.printf("가수 : %s\n", name);
	}
}
