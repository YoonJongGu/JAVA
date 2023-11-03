package ex02;

public class Student {
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	// 생성자는 name, kor, eng, mat만 받는다
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
	}
	
	// 모든 Student의 객체는 반드시 이름과 국영수를 포함해야 한다
	// 값을 전달하지 않고서는 절대로 객체를 생성할 수 없다
	
	
	// toString을 오버라이딩 하여 main에서 객체의 값을 바로 확인 할 수 있다
	public String toString() {
		String str = "이름 : %s ( 국어 : %d, 영어 : %d, 수학 : %d )\n합 : %d / 평균 : %.1f\n\n";
		String form = String.format(str, name, kor, eng, mat, sum, avg);		
		return form;
	}
}
