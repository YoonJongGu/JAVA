package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Todo> list = null;
		// ex03.dat의 객체를 list에 저장하여 아래 출력코드가 작동할 수 있도록 처리하세요
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();
		
		for(int i = 0; i < list.size(); i++) {
			Todo t = list.get(i);
			System.out.println(t);
		}
		System.out.println("\n=====================================\n");
		
		for(Todo t: list) {
			System.out.println(t);
		}
		System.out.println("\n=====================================\n");
		
		list.forEach(t -> System.out.println(t));
		System.out.println("\n=====================================\n");
		
		list.forEach(System.out::println);
		System.out.println("\n=====================================\n");
	}
}
