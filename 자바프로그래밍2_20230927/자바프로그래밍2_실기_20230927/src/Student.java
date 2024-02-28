
public class Student {
	// 6개의 멤버변수(인스턴스 변수)
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 2개의 멤버 메소드(인스턴스 메소드)
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverge() {
//		return getTotal() / 3.0f;
		return Math.round(getTotal() / 3.0f * 100) / 100.0f; 
		// (float)3 가능
		// 소수점 2자리 표현
	}
}
