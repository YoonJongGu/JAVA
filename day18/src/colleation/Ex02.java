package colleation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// 1에서 45 사이의 자연수 중에서 중복되지 않은 값 6개를 추출하세요
		
		// 1) 랜덤 객체 및 Set 준비
		Set<Integer> set = new HashSet<Integer>();
		Random ran = new Random();				
		
		// 2) set의 크기가 6보다 작을때까지, 랜덤정수를 추출하여 set에 추가한다		
		while(set.size() < 6) {
			int num = ran.nextInt(45) + 1;
			System.out.println("뽑은 숫자 : " + num);
			set.add(num);
		}
		
		// 3) set의 값을 출력한다		
		System.out.println("set : " + set);
		
		// 4) Collection의 생성자에 다른 Collection을 널어서 객체를 생성할 수 있다
		// 이때, 기존 컬렉션의 구성 요소가 새로운 컬렉션에 그대로 이전된다
		// Set을 이용하여 List를 만든다
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("list : " + list);
		
		// 5) list는 index도 있고, sort()함수도 있어서 정렬을 수행할 수 있다
		list.sort(null);
		System.out.println("list : " + list);
	}
}
