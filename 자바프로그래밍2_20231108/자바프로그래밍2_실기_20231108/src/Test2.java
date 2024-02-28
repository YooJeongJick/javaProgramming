import java.awt.*;

public class Test2 {
	public static void main(String[] args) {
		Color c1 = new Color(100, 55, 200); // RGB(0 ~ 255)
		Color c2 = new Color(133, 233, 250);
		
		Font f1 = new Font("Serif", Font.BOLD, 20);
		Font f2 = new Font("SansSerif", Font.ITALIC, 25);
		
		Frame f = new Frame("프레임 연습");
		f.setBounds(200, 200, 600, 400);
		f.setBackground(c2);
		f.setLayout(null); // 프레임 레이아웃 사용안함!(직접 좌표 사용하여 표현)
		
		Button b1 = new Button("확인");
		b1.setBounds(50, 80, 200, 100);
		b1.setBackground(c1);
		b1.setForeground(Color.white);
		b1.setFont(f1);
		
		Button b2 = new Button("취소");
		b2.setBounds(50, 230, 200, 100);
		b2.setBackground(Color.yellow);
		b2.setForeground(new Color(100, 30, 230));
		b2.setFont(f2);
		
		Choice ch1 = new Choice(); // 초이스 객체 생성
		ch1.setBounds(300, 80, 100, 30);
		
		ch1.add("월요일");
		ch1.add("화요일");
		ch1.add("수요일");
		ch1.add("목요일"); 
		ch1.add("금요일"); 
		ch1.add("토요일");
		ch1.add("일요일");
		
		List l1 = new List(); // 단일 모드
		l1.setBounds(450, 80, 100, 100);
		
		l1.add("월요일");
		l1.add("화요일");
		l1.add("수요일");
		l1.add("목요일"); 
		l1.add("금요일"); 
		l1.add("토요일");
		l1.add("일요일");

		l1.setMultipleMode(true);
		
		Label lal = new Label("하고 싶은 말"); // 레이블 객체 생성(왼쪽 정렬 기본)
		lal.setBounds(300, 200, 250, 30);
		lal.setBackground(Color.pink);
		lal.setAlignment(Label.CENTER);
		lal.setFont(f1);
		
		TextArea tal = new TextArea(10, 5);
		tal.setBounds(300, 230, 250, 120);
		tal.setFont(f1);
		tal.setText("안녕하세요");
		tal.appendText("\n\n자바 awt 입니다.\n수업 끝!"); // 뒤에 이어 붙이기!
		tal.setEditable(true);
		
		// 프레임에 컨포넌트(컨테이너) 붙이기!
		f.add(b1); 
		f.add(b2);
		f.add(ch1);
		f.add(l1);
		f.add(lal);
		f.add(tal);
		
		f.setVisible(true);
	}

}
