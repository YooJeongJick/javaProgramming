
public class Tv {
	boolean power;
	int channel;
	
	Tv() {
		power = false;
		channel = 10;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}
