package test05;

public class DeskTop extends Computer{

	@Override
	void display() {
		System.out.println("DeskTop display");
	}

	@Override
	void typing() {
		System.out.println("DeskTop typing");
	}

	@Override
	public void turnOff() {

		System.out.println("Desktop turnoff");
	}

	@Override
	public void turnOn() {
		//super.turnOn();
		System.out.println("Desktop turn on");
	}
}
