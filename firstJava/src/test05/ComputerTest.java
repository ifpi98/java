package test05;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.turnOff();
		// 노트북은 추상클래스라서 인스턴스를 생성할 수 없다.

		DeskTop computer2 = new DeskTop();
		computer2.typing();


	}
}
