package airplane;

public class Doctor extends Human {
	Doctor(String name) {
		super(name);
	}
	
	void heal(Human other) {
		System.out.println(name + " 의사가 " + other.name + " 치료");
	}
	
	void show() {
		System.out.printf("의사 : %s\n", name);
	}

}
