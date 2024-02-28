import java.awt.*;
import java.awt.event.*;

public class Test4 {

	public static void main(String[] args) {
		Frame f = new Frame("메뉴 연습");
		f.setBounds(200, 200, 500, 400);
		f.setBackground(new Color(150, 200, 255));
		
		MenuBar mb = new MenuBar(); // 메뉴바 객체 생성
		
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New File");
		MenuItem miOpen = new MenuItem("Open");
		
		Menu mPrint = new Menu("Print");
		MenuItem miPrint = new MenuItem("Print");
		MenuItem miPreview = new MenuItem("Preview");
		mPrint.add(miPrint);
		mPrint.add(miPreview);
		
		MenuItem miExit = new MenuItem("Exit");
		
		// 메뉴 mFile에 메뉴 아이템 or 메뉴 붙이기 
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mPrint); // 메뉴에 메뉴를 붙여서 깊이 있게 표현가능!
		mFile.addSeparator(); // 구분선 추가
		mFile.add(miExit);
		
		Menu mEdit = new Menu("Edit");
		CheckboxMenuItem cbmi = new CheckboxMenuItem("Check");
		mEdit.add(cbmi);
		
		Menu mHelp = new Menu("Help");
		
		// 메뉴바에 메뉴 붙이기
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mHelp);
		
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
		
		f.setMenuBar(mb); // 프레임에 메뉴바 붙이기
		f.setVisible(true); // 프레임 보이기
	}

}
