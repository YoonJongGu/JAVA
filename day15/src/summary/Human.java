package summary;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void give(Life lf) {
		String method = "";				// 슈퍼 클래스 타입으로 묶어서 받아도, 필요하면 구별할 수 있다
		if(lf instanceof Animal) method = "던져";
		if(lf instanceof Human) method = "건네";
		System.out.printf("%s이 %s에게 %s %s준다\n", this.name, lf.getName(), lf.getEat(), method);	
		
	}

}
