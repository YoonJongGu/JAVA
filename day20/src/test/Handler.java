package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {
	
	private List<Person> list = new ArrayList<Person>();
	private File f = new File("D:\\2022_10월_취업반_윤종구\\actorBirth.json");
	private Scanner loader;
	private FileWriter writer;
	
	public void load() throws IOException {
		if(f.exists()) {
			loader = new Scanner(f);
			String line = "";
			int cnt = 0;
			while(loader.hasNextLine()) {
				line += loader.nextLine();				
			}
			line = line.replace("[", "");
			line = line.replace("]", "");
			line = line.replace(" ", "");			
			line = line.replace("{", "");
			line = line.replace("}", "");
			line = line.replace("\"", "");
			line = line.replace("name:", "");
			line = line.replace("birth:", "");
			String[] arr = line.split(",");
//			for(int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
			for(int i = 0; i < arr.length; i += 2) {
				cnt++;
				Person p = new Person(arr[i], arr[i+1]);
				list.add(p);
			}
			loader.close();
			System.out.printf("\n\t%d개 데이터 불러오기 완료 !!\n\n", cnt);
//			for(Person pe: list) {
//				pe.show();
//			}			
		}
		else {
			System.out.println("불러올 데이터가 없습니다");			
		}
	}
	
	public void showList() {
		for(Person p: list) {
			p.show();
		}
	}

	public void save() throws IOException {
		writer = new FileWriter(f);
		for(int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			writer.append(p.getFileData());
		}
		writer.flush();
		writer.close();
		System.out.println("저장 완료 !!");	
	}

	public void insert(Person p) {
		list.add(p);		
	}

	public void delete(String name) {
		list.removeIf(p -> p.name.equals(name));		
	}

	public void sortName() {
		list.sort((a, b) -> a.name.compareTo(b.name));		
	}

	public void sortBirth() {
		list.sort((a, b) -> a.birth.compareTo(b.birth));
	}
	
}
