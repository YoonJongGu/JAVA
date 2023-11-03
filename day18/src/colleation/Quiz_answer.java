package colleation;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz_answer {
	public static void main(String[] args) {
		String json = "[";
		json += "{\"name\": \"강하늘\", \"pnum\": \"010-2323-2323\"}";
		json += ",";
		json += "{\"name\": \"홍진호\", \"pnum\": \"010-2222-2222\"}";
		json += "]";
		
//		String test = "say \"Hello\" !!";
//		System.out.println(test);
		
		// ArrayList와 HashMap을 이용하여, 위 문자열에서 데이터만 추출하여
		// 객체 형식으로 저장하고 출력하세요
		// split, replace, trim 등의 문자열 함수를 적극적으로 활용하세요
		
		System.out.println("원본 : " + json);
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		
		// 1) 필요없는 글자는 제거한다
		json = json.replace(" ", "");
		json = json.replace("\"", "");
		System.out.println("1) " + json);
		
		// 2) 반복문 안에서 각 객체(각각의 객체는 {} 로 묶여있다)를 구별하여 변수에 담는다
		while(json.contains("{")) {
			HashMap<String, String> map = new HashMap<String, String>();
			
			int begin = json.indexOf("{");
			int end = json.indexOf("}") + 1;
			String person = json.substring(begin, end);
			json = json.substring(end + 1);
//			System.out.println("person : " + person);
//			System.out.println("json : " + json);
			
			person = person.replace("{", "");
			person = person.replace("}", "");
			
			String name = person.split(",")[0];
			String pnum = person.split(",")[1];
			
			map.put(name.split(":")[0], name.split(":")[1]);
			map.put(pnum.split(":")[0], pnum.split(":")[1]);
			
//			System.out.println(name);
//			System.out.println(pnum);
			
			System.out.println();
			list.add(map);
		}
		
		System.out.println("결과 : " + list);
		
		System.out.println(list.get(0).get("name"));
		System.out.println(list.get(0).get("pnum"));
		System.out.println(list.get(1).get("name"));
		System.out.println(list.get(1).get("pnum"));
		
	}
}
