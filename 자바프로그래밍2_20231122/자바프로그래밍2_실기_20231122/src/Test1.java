
import java.awt.*; // AWT 컨포넌트 사용하기 위해 
import java.awt.event.*; // 이벤트 처리하기 위해

// 3. 이벤트 핸들러(처리기)
class Event1 implements WindowListener {
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) { 
		// 프레임(윈도우) x버튼 누를때 자동 호출됨!
		System.exit(0); // 프로그램 종료
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {} 
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}

class Event2 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		// 필요한 부분만 오버라이딩!
		System.exit(0); // 프로그램 종료
	}
}

public class Test1 {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 연습"); // 1. 이벤트 소스(대상)
		f.setBounds(200, 200, 500, 400);
		
		// 2. 이벤트 리스너(감지기)
		f.addWindowListener(new WindowAdapter() {
			// 익명 클래스(일회용)
			public void windowClosing(WindowEvent e) {
				// 필요한 부분만 오버라이딩!
				System.exit(0); // 프로그램 종료
			}
		});
		
		f.setVisible(true); // 프레임 보이기

	}
}
