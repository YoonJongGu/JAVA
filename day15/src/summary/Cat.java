package summary;

public class Cat extends Animal implements Life {
	
	Cat(String name) {
		super(name);
	}

	@Override
	public String getEat() {
		return "츄르를";
	}

}
