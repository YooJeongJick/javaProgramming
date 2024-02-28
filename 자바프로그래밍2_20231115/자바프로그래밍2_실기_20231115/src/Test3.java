import java.awt.*;

public class Test3 {

	public static void main(String[] args) {
		Frame f = new Frame("그리드 레이아웃 연습");
		f.setBounds(200, 200, 500, 400);
		f.setLayout(new GridLayout(3, 3)); // 3행 3열
//		f.setLayout(new GridLayout(3, 3, 5, 5)); (5, 5) (좌우, 위아래 간격)
		
		Button b1 = new Button("button1");
		Button b2 = new Button("button2");
		Button b3 = new Button("button3");
		Button b4 = new Button("button4");
		Button b5 = new Button("button5");
		Button b6 = new Button("button6");
		Button b7 = new Button("button7");
		Button b8 = new Button("button8");
		Button b9 = new Button("button9");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);

		f.setVisible(true); // 프레임 보이기
	}
}
