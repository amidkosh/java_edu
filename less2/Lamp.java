package less2;

public class Lamp {
	int brightness;
	boolean state;

	public void turnOn() {
		this.state = true;
		this.brightness = 100;
	}

	public void turOff() {
		this.state = false;
		this.brightness = 0;
	}

	@Override
	public String toString() {
		return "";

	}

	public void switchState() {
		this.state = !this.state;
		this.brightness = this.state ? 100 : 0;

	}

	void getInfo() {
		System.out.println("Status: " + state + "; Brightness: " + brightness);
	}
}
