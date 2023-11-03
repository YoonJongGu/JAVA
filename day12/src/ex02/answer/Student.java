package ex02.answer;

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
	
	
	public String toString() {
		return String.format("%s, %d, %d, %d (%d / %.2f)", name, kor, eng, mat, sum, avg);
	}

}
