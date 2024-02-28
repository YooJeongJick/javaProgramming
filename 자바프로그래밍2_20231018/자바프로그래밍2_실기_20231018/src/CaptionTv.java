
public class CaptionTv extends Tv {
	String text;

	CaptionTv() {
		text = "없음";
	}
	
	void printCaption() {
		System.out.println("자막 : " + text);
	}
}
