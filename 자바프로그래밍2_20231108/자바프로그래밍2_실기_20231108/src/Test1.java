import java.awt.*; // AWT (컨포넌트, 컨테이너) 사용하기 위해

public class Test1 {

	public static void main(String[] args) {
		Frame f = new Frame("기본 제목표시줄"); // 프레임(독립적인 컨테이너) 객체 생성
		
//		f.setLocation(100, 100); // 프레임 시작 위치(x,y)
//		f.setSize(400, 300); // 프레임 너비, 높이 
		
		f.setBounds(200, 200, 500, 300); // 프레임 시작위치, 너비 / 높이 설정!
		
		f.setTitle("메롱");
		System.out.println("제목표시줄에 있는 내용 : " + f.getTitle());
		
		f.setBackground(Color.green); // 프레임 배경색 설정
		
		f.setVisible(true); // 프레임 보이기!!
	}

}
