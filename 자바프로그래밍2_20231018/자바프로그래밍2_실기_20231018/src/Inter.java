// 인터페이스 정의
// 변수 : static final
// 메소드 : abstract (모든 메소드가 추상 메소드임)

public interface Inter {
	int a = 10;					// static final int a = 10;
	final int b = 20;			// static final int b = 20;
	static int c = 30;			// static final int c = 30;
	static final int d = 40;	// static final int d = 40;
	
	void fun1();
	abstract void fun2();
}
