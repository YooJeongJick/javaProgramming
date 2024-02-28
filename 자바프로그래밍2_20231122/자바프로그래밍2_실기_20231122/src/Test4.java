
import java.awt.*; // AWT 컨포넌트 사용하기 위해 
import java.awt.event.*; // 이벤트 처리하기 위해

public class Test4 {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 연습"); // 1. 이벤트 소스(대상)
		f.setBounds(200, 200, 500, 400);
		f.setLayout(null); 
		
		Label l1 = new Label("choose a menu", Label.CENTER);
		l1.setBounds(100, 50, 300, 50);
		l1.setBackground(Color.yellow);
		
		Button b1 = new Button("menu1");
		b1.setBounds(50, 200, 100, 100);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(b1.getLabel() + 
						" 버튼을 클릭하셨습니다.");
				l1.setText(b1.getLabel());
			}
		});
		
		Button b2 = new Button("menu2");
		b2.setBounds(200, 200, 100, 100);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(b2.getLabel() + 
						" 버튼을 클릭하셨습니다.");
				l1.setText(b2.getLabel());
			}
		});

		Button b3 = new Button("menu3");
		b3.setBounds(350, 200, 100, 100);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(b3.getLabel() + 
						" 버튼을 클릭하셨습니다.");
				l1.setText(b3.getLabel());
			}
		});

		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});
		
		f.setVisible(true);
	}

}
