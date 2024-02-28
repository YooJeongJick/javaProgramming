
import java.awt.*; // AWT 컨포넌트 사용하기 위해 
import java.awt.event.*; // 이벤트 처리하기 위해

// 3. 이벤트 핸들러(처리기)
class Event3 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭하셨습니다.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 연습"); // 1. 이벤트 소스(대상)
		f.setBounds(200, 200, 500, 400);
		f.setLayout(null); 

		Button b1 = new Button("check"); // 1. 이벤트 소스(대상)
		b1.setBounds(100, 150, 150, 100);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(b1.getLabel() + 
						" 버튼을 클릭하셨습니다.");
			}
		});
		
		Button b2 = new Button("out"); // 1. 이벤트 소스(대상)
		b2.setBounds(270, 150, 150, 100);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(b2.getLabel() + 
						" 버튼을 클릭하셨습니다.");
			}
		});
		
		f.add(b1);
		f.add(b2);
		
		// 프레임 닫기(x버튼) 이벤트 처리
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
