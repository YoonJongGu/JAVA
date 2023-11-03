package colleation;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {
	public static void main(String[] args) {
		String json = "[";
		json += "{\"name\": \"강하늘\", \"pnum\": \"010-2323-2323\"}";
		json += ",";
		json += "{\"name\": \"홍진호\", \"pnum\": \"010-2222-2222\"}";
		json += "]";
		
//		System.out.println(json);
		
		// ArrayList외 HashMap을 이용하여, 위 문자열에서 데이터만 추출하여
		// 객체 형식으로 저장하고 출력하세요
		// split, replace, trim 등의 문자열 함수를 적극적으로 활용하세요
		json = json.trim();
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();		
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		for(String str: json.split("\"")) {
			l1.add(str);
		}

		for(int i = 0; i < l1.size(); i++) {
			if(i % 2 == 1) {
				l2.add(l1.get(i));
			}
		}		

		HashMap<String, String> m1 = new HashMap<String, String>();
		HashMap<String, String> m2 = new HashMap<String, String>();

		for(int i = 0; i < l2.size() / 2; i += 2) {
			m1.put(l2.get(i), l2.get(i + 1));
			m2.put(l2.get(i + 4), l2.get(i + 5));
		}
		
		list.add(m1);
		list.add(m2);
		System.out.println(list);
	}
}
