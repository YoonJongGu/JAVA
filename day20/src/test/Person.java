package test;

public class Person {
	String name;
	String birth;
	
	Person(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public void show() {
		System.out.println("name : " + name);
		System.out.println("birth : " + birth);
		System.out.println();
	}

	public String getFileData() {
		String format = "name : %s\nbirth : %s\n";	
		return String.format(format, name, birth);
	}
}
