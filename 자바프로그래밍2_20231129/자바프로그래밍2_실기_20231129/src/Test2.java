import java.awt.*;
import java.awt.event.*;

public class Test2 extends Frame {
	Label l1, l2;
	CheckboxGroup cbg;
	Checkbox cb1, cb2, cb3, cb4;
	Button b1;
	
	Test2(String title) {
		super(title);
		
		setBounds(200, 200, 400, 300);
		setLayout(new GridLayout(7, 1)); // 7행 1열
		
		l1 = new Label("Check standard layout of a Panel", Label.CENTER);
		
		cbg = new CheckboxGroup(); // 라이오 버튼으로 만들기 위해 필요!!
		cb1 = new Checkbox("1. BorderLayout", cbg, false);
		cb2 = new Checkbox("2. FlowLayout", cbg, false);
		cb3 = new Checkbox("3. GridLayout", cbg, false);
		cb4 = new Checkbox("4. CardLayout", cbg, false);

		b1 = new Button("check"); // 1. 이벤트 소스(대상)
		
		// 2. 이벤트 리스너(감지기)
		b1.addActionListener(new Event3());
		
		l2 = new Label("result : ", Label.CENTER);

		add(l1); add(cb1); add(cb2); add(cb3); add(cb4); add(b1); add(l2);
		
		addWindowListener(new WindowAdapter() { // 프레임 닫기 이벤트
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});
		
		setVisible(true); // 프레임 보이기
	}
	
	class Event3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int score = 0;
			
			if (cb1.getState()) score = 0; 
			else if (cb2.getState()) score = 100; 
			else if (cb3.getState()) score = 0; 
			else if (cb4.getState()) score = 0; 
	
			l2.setText("Total score : " + score);
		}
	}
	
	// 3. 이벤트 핸들러(처리기), 내부 클래스
	class Event2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String str = "";
			
			if (cb1.getState()) str = cb1.getLabel(); 
			else if (cb2.getState()) str = cb2.getLabel(); 
			else if (cb3.getState()) str = cb3.getLabel(); 
			else if (cb4.getState()) str = cb4.getLabel(); 
	
			l2.setText("result : " + str);
			
		}
	}
	
	public static void main(String[] args) {
		new Test2("이벤트 처리2");
	}
}
