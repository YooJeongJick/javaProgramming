
public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student("kim", 1, 1001, 98, 80, 78);
		
		System.out.println("1번 학생 총점 : " +s1.getTotal()+ "점");
//		System.out.println("1번 학생 평균 : " +s1.getAverge()+ "점");
//		System.out.printf("1번 학생 평균 : %.2f점", s1.getAverge());
		
		// Math.round(1.5) -> (반올림)2
		System.out.println("1번 학생 평균 : " +s1.getAverge()+ "점");
	}
}
