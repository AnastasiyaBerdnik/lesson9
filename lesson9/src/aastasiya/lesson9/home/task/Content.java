package aastasiya.lesson9.home.task;

import java.util.ArrayList;

public class Content {

	public static void main(String[] args) {
		Newspaper myNewspaper = new Newspaper("Time", 1986, 20, "German",
				"News");
		Journal myJournal = new Journal("Cosmo", 2018, 100, "German", "Fashion");
		Journal myJournal1 = new Journal("Science", 2018, 33, "English",
				"Science");
		Book myBook = new Book("Onegin", 1966, 77, "Russian", "Pushkin");

		myNewspaper.show();
		myJournal.show();
		myJournal1.show();
		myBook.show();

	}

}
