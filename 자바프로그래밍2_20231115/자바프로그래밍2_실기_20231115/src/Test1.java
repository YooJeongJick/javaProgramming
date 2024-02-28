import java.awt.*;

public class Test1 {

	public static void main(String[] args) {
		Frame f = new Frame("레이아웃 연습"); // 프레임(독립적인 컨테이너) 객체 생성
		f.setBounds(200, 200, 500, 400); // 프레임 시작위치, 가로 / 세로 설정
		
		f.setLayout(new BorderLayout(5, 5)); // (5, 5) (좌우, 위아래 간격)
		// 프레임의 기본 레이아웃은 BoderLayout임!(동, 서, 남, 북, 중앙)
		
//		f.setLayout(null);
		// 컨테이너 레이아웃 설정! null은 직접 좌표로 붙이기!
		
		Button b1 = new Button("button1");
		Button b2 = new Button("button2");
		Button b3 = new Button("button3");
		Button b4 = new Button("button4");
		Button b5 = new Button("button5");
		
		// 프레임에 컨포넌트(버튼 2개) 붙이기
		f.add(b1, BorderLayout.EAST);
		f.add(BorderLayout.WEST, b2);
		f.add(b3, "South");
		f.add("North", b4);
		f.add(b5, "Center");

		
		f.setVisible(true); // 프레임 보이기
	}

}
