import java.awt.*; // 컴포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해

public class Test5 {

	public static void main(String[] args) {
		Frame f = new Frame("팝업메뉴 연습");
		f.setBounds(200, 200, 500, 400);

		PopupMenu p = new PopupMenu();
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		
		// 팝업메뉴 P에 메뉴아이템 3개 붙이기
		p.add(miCut);
		p.add(miCopy);
		p.add(miPaste);
		
		f.add(p); // 프레임에 팝업메뉴 붙이기
		
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				if (me.getModifiers() == me.BUTTON3_MASK); {
					p.show(f, me.getX(), me.getY());
				}
			}
		});
		
		f.setVisible(true);
	}

}
