import java.awt.*;
import java.awt.event.*;


public class Test1 extends Frame {
	Label lid, lpw;
	TextField tfid, tfpw;
	Button ok;
	
	Test1(String title) {
		super(title); // Frame("이벤트 처리1")
		
		lid = new Label("ID : ", Label.RIGHT );
		lpw = new Label("Password : ", Label.RIGHT);

		tfid = new TextField(10);
		tfid.addActionListener(new Event1());		
		
		tfpw = new TextField(10);
		tfpw.setEchoChar('●'); // 비번은 인력값 대신 '●'로 보이게 함!
		tfpw.addActionListener(new Event1());

		ok = new Button("OK"); // 1. 이벤트 소스(대상)
		// 2. 이벤트 리스너(감지기)
		ok.addActionListener(new Event1());
		
		setBounds(200, 200, 450, 80);
		setLayout(new FlowLayout()); // 왼 -> 오른, 위 -> 아래, 가운데정렬
		setBackground(new Color(170, 220, 90));
		
		// 프레임에 컨포넌트 붙이기
		add(lid); add(tfid); add(lpw); add(tfpw); add(ok);
		
		addWindowListener(new WindowAdapter() { // 프레임 닫기 이벤트
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});
		
		setVisible(true); // 프레임 보이기
	}
	
	// 외부 클래스 : Test1
	// 내부 클래스 : Event1 (외부에 멤버 접근 가능)
	class Event1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(tfid.getText() + "님! 환영합니다.");
		}
	}

	public static void main(String[] args) {
		new Test1("이벤트 처리1");
	}
}
