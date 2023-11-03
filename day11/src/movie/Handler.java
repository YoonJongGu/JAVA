package movie;

public class Handler {
	// 2) 프로그램에서 구현할 기능
	// 목록, 추가, 삭제, 검색
	
	static Movie[] arr = new Movie[10];
	
	static String getList() {
		String result = "\n";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += (i + 1) + ")";
				result += arr[i].getInfo();
				result += "\n";
			}						
		}
		return result;
	}
	
	static int insert(Movie ob) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;		
	}
	
	static String search(String keyword) {
		String result = "검색 결과를 찾을 수 없습니다";
		for(int i = 0; i < arr.length; i++) {
			// i번째 칸이 빈칸이 아니고, i번째 요소의 내용에 keyword가 포함되어 있으면
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				result = arr[i].getDetail();
				break; // 원하는 요소를 하나 찾았다면 더이상 반복하지 않는다
			}
		}
		return result;
	}
	
	static String searchList(String keyword) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			// i번째 칸이 빈칸이 아니고, i번째 요소의 내용에 keyword가 포함되어 있으면
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				result += arr[i].getInfo() + "\n";	
				// 원하는 요소를 찾고나서 다른 요소도 추가로 검색하여 결과에 누적시킨다
			}
		}
		return result;
	}	

	static int delete(int idx) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[idx - 1] != null) {
				arr[idx - 1] = null;
				return 1;
			}
		}
		return 0;
	}
	
	static int delete(String keyword) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.equals(keyword)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;		
	}
}
