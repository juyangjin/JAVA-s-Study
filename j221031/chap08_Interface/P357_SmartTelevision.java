package j221031.chap08_Interface;

public class P357_SmartTelevision implements P355_RemoteControl,P356_Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	} 
	public void turnOff() {
		System.out.println("TV를 켭니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
