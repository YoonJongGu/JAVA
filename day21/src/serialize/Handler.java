package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Handler {
	
	private ArrayList<Todo> list;
	
	public Handler() {
		load();
		System.out.println("파일 불러오기 완료 !!");
	}
	
	@SuppressWarnings("unchecked")
	private void load() {	// 생성자 내부에서 호출함. 파일에서 객체를 불러와서 리스트에 저장
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
			list = (ArrayList<Todo>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {}
		}		
	}
	
	public void save() {	// main에서 호출함. 리스트 객체를 파일로 저장
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("ex03.dat"));
			oos.writeObject(list);
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			try { oos.close(); } catch(Exception e) {}
			System.out.println("저장 완료 !!");
		}		
	}
	
	public void showList() {
		list.forEach(todo -> System.out.println(todo));
	}
	
	public int insert(Todo todo) {	// 객체를 전달받아서 추가하기				
		return list.add(todo) ? 1 : 0;
	}
	
	public int delete(Todo todo) {	// 선택한 객체의 index를 확인하여 제거하기				
		return list.removeIf(t -> t.toString().equals(todo.toString())) ? 1 : 0;
	}
	
	public void sortByDate() {
		list.sort((a, b) -> a.getDate().compareTo(b.getDate()));
	}
}
