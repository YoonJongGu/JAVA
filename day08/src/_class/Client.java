package _class;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket so = new Socket("127.0.0.1", 1234);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		bw.append("Hello, world !!");
		bw.flush();
		bw.close();
		
		so.close();
		
	}
}
