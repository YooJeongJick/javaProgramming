
import java.awt.*; // AWT 컨포넌트 사용하기 위해 
import java.awt.event.*; // 이벤트 처리하기 위해

class Event4 implements MouseMotionListener {

	public void mouseDragged(MouseEvent e) {
//		System.out.println("메롱~~");
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println
		("(" + e.getX() + ", " + e.getY() + ")");
	}
}

// Adapter 클래스 : 2개 이상 추상메소드를 갖는 인터페이스를 미리 구현한 클래스
class Event5 extends MouseMotionAdapter{
	public void mouseMoved(MouseEvent e) {
		//
	}
}

public class Test3 {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 연습"); // 1. 이벤트 소스(대상)
		f.setBounds(200, 200, 500, 400);
		f.setLayout(null); 

		Label l1 = new Label("Monuse Pointer Location :");
		l1.setBounds(7, 30, 200, 20);
		l1.setBackground(Color.yellow);
		
		f.add(l1);
		
		f.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e) {
				l1.setText
				("Monuse Pointer Location : "
						+ "(" + e.getX() + ", " + e.getY() + ")");
				
				if (e.getX() == e.getY()) {
					System.out.println
					("(" + e.getX() + ", " + 
					e.getY() + ") -> x, y 동일!");
				} else {
					System.out.println
					("(" + e.getX() + ", " + e.getY() + ")");
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});

		f.setVisible(true); // 프레임 보이기
	}

}
