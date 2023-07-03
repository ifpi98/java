package test04;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		library.add(new Book("반지의 제왕", "호킨스"));

		// ArrayList.size()
		// ArrayList.get()

		for(int i =0; i<library.size(); i++) {
			library.get(i).showBookInfo();
		}

		library.get(0).showBookInfo();


		Vector<Book> library2 = new Vector<Book>();

		library2.add(new Book("태백산맥1", "조정래"));
		library2.add(new Book("태백산맥2", "조정래"));
		library2.add(new Book("태백산맥3", "조정래"));
		library2.add(new Book("태백산맥4", "조정래"));
		library2.add(new Book("태백산맥5", "조정래"));
		library2.add(new Book("반지의 제왕", "호킨스"));

		// ArrayList.size()
		// ArrayList.get()

		for(int i =0; i<library2.size(); i++) {
			library2.get(i).showBookInfo();
		}

		library2.get(0).showBookInfo();


	}
}
