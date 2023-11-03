package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		FileWriter fw = new FileWriter(f, true);	// append: true/false
		// autoFlush : 자동으로 flush가 설정되어 있음
		
		fw.append("Hello");
		fw.append(", ");
		fw.append("World");
		
		fw.close();
		
		System.out.println("끝");
	}
}
