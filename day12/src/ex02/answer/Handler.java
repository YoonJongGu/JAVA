package ex02.answer;

public class Handler {

	Student[] arr = new Student[5];

	public String selectAll() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].toString() + "\n";
			}
		}
		return result;
	}

	public int insert(Student ob) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	// 목록, 추가, 단일검색(이름), 수정, 삭제
	
	String search(String name) {
		String result = "결과를 찾을 수 없습니다";
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				result = arr[i].toString();
				break;
			}
		}
		return result;
	}

	int update(String name, int kor, int eng, int mat) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {	// 이름이 같으면
				arr[i].kor = kor;				// 국어 영어 수학 점수를 새로 대입하고
				arr[i].eng = eng;
				arr[i].mat = mat;
				arr[i].sum = kor + eng + mat;	// 합계와 평균도 다시 계산하여 넣어준다
				arr[i].avg = arr[i].sum / 3.0;
				return 1;
			}
		}
		return 0;
	}

	int delete(String name) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
}
