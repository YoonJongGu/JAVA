package summary;

public class Friend extends Human implements Life {

	Friend(String name) {
		super(name);
	}

	@Override
	public String getEat() {
		return "주먹밥을";
	}

}
