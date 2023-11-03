package ex02;

public class Handler {
	
	Student[] arr = new Student[5];
	
	// 목록, 추가, 단일검색(이름), 수정, 삭제

	public String selectAll() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].toString();
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

	public String search(String name) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				result = arr[i].toString();
				break;
			}
		}
		return result;
	}

//	public int update(Student ob) {
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != null && arr[i].name.equals(ob.name)) {
//				arr[i].kor = ob.kor;
//				arr[i].eng = ob.eng;
//				arr[i].mat = ob.mat;
//				arr[i].sum = ob.kor + ob.eng + ob.mat;
//				arr[i].avg = arr[i].sum / 3.0;
//				return 1;				
//			}
//		}
//		return 0;
//	}
	
	public int update(String name, int kor, int eng, int mat) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				if(kor != 0) {
					arr[i].kor = kor;
				}
				if(eng != 0) {
					arr[i].eng = eng;
				}
				if(mat != 0) {
					arr[i].mat = mat;
				}
				arr[i].sum = arr[i].kor + arr[i].eng + arr[i].mat;
				arr[i].avg = arr[i].sum / 3.0;
				return 1;				
			}
		}
		return 0;
}

	public int delete(String name) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	
}
