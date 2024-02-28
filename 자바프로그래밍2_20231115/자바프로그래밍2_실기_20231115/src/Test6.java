import java.awt.*;

public class Test6 {

	public static void main(String[] args) {
		Frame f = new Frame("컨포넌트 연습"); // 독립적인 컨테이너
		f.setLayout(null); // 프레임의 기본 레이아웃은 BorderLayout
		f.setBounds(200, 200, 400, 500);
		f.setBackground(new Color(181, 230, 29));
		
		Label l1 = new Label("Choose your blood type", Label.CENTER);
		l1.setBounds(50, 80, 300, 50);
		l1.setBackground(new Color(239, 228, 176));
		l1.setFont(new Font("Serif", Font.BOLD, 20));
		l1.setForeground(new Color(70, 10, 90));
		
		Panel p1 = new Panel(); // 종속적인 컨테이너
		p1.setLayout(new GridLayout(4, 1)); // 4행 1열 표현, 패널 기본 레이아웃 FlowLayout
		p1.setBounds(50, 150, 300, 150);
		p1.setBackground(new Color(255, 242, 0));
		
		CheckboxGroup cbg = new CheckboxGroup(); // 라디오버튼 만들기 위해 필요!
		Checkbox cb1 = new Checkbox("A", cbg, false);
		Checkbox cb2 = new Checkbox("B", cbg, false);
		Checkbox cb3 = new Checkbox("AB", cbg, false);
		Checkbox cb4 = new Checkbox("O", cbg, false);
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		//
		Panel p2 = new Panel();
		p2.setLayout(null);
		p2.setBounds(50, 330, 300, 120);
		p2.setBackground(Color.cyan);
		
		Button b1 = new Button("button1");		
		Button b2 = new Button("button2");
		Button b3 = new Button("button3");

		b1.setBounds(30, 50, 70, 50);
		b2.setBounds(115, 20, 70, 50);
		b3.setBounds(200, 60, 70, 50);

		p2.add(b1);
		p2.add(b2);
		p2.add(b3);


		// 프레임에 컨포넌트 붙이기
		f.add(l1);
		f.add(p1);
		f.add(p2);
		
		f.setVisible(true);
	}

}
