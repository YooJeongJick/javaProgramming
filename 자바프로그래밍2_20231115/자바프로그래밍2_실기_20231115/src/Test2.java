import java.awt.*;

public class Test2 {

	public static void main(String[] args) {
		Frame f = new Frame("플로우 레이아웃 연습");
		f.setBounds(200, 200, 500, 400);
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); // (5, 5) (좌우, 위아래 간격) 
		// 왼 -> 오, 위 -> 아래 / 좌우 간격 5, 위아래 간격 5
		
		// 프레임에 버튼 붙이기
		f.add(new Button("Button1"));
		f.add(new Button("Button2"));
		f.add(new Button("Button3"));
		f.add(new Button("Button4"));
		f.add(new Button("Button5"));
		
		f.setVisible(true); // 프레임 보이기

	}
}
