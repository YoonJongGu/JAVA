package summary;

public class Dog extends Animal implements Life {	
	
	Dog(String name) {
		super(name);
	}

	@Override
	public String getEat() {
		return "개껌을";
	}

}
