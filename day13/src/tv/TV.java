package tv;

public class TV {
	// TV 클래스를 구성하세요
	// 필드는 속성을 저장합니다 : ex) 전원, 채널, 볼륨, 음소거 상태 등...
	// 메서드는 기능을 정의합니다 : 채널 올림/내림, 볼륨 올림/내림, 전원 on/off, 음소거 기능 등...
	// 생성자는 객체 생성 시 초기 작동을 담당합니다. (생성된 TV의 초기 채널은 2로 설정한다)
	// 접근제한자는 필드에 대해 private, 메서드에 대해 public을 적용합니다
	// getter/setter는 사용해도 되고, 생략해도 됩니다
	
	private boolean power;
	private int channel = 2;	// 2 ~ 10
	private int volume = 10;	// 0 ~ 20
	private int muteVolume = 0;
	
	public void powerBtn() {
		power = !power;	// 저장된 값이 true이면 false를 대입하고, false이면 true를 대입한다
		show();
	}
	
	public void channelUp() {
		if(power) {
			channel++;
			if(channel > 10) 	
				channel = 2;
		}
		show();
	}
	
	public void channelDown() {
		if(power) {
			channel--;
			if(channel < 2) 	
				channel = 10;
		}
		show();
	}
	
	public void volumeUp() {
		if(power && volume < 20) {
			volume++;
		}
		show();
	}
	
	public void volumeDown() {
		if(power && volume > 0) {
			volume--;
		}
		show();
	}
	
	public void mute() {
		if(power) {
			int tmp = volume;
			volume = muteVolume;
			muteVolume = tmp;
		}
		show();
	}
	
	private void show() {
		if(power) {
			System.out.println("전원 : " + power);
			System.out.println("채널 : " + channel);
			System.out.println("음량 : " + volume);
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("전원 off 상태");
			System.out.println();
		}
	}
}	






