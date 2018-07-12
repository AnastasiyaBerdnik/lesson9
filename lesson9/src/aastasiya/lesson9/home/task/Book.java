package aastasiya.lesson9.home.task;

public class Book extends PrintPatter {
	private String author;

	public Book(String title, int year, int pages, String lang, String author) {
		super(title, year, pages, lang);
		this.author = author;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public void show() {
		System.out.println("[" + "  title   " + title + "  year  "+ year + "  pages  "+pages + "  lang  "+lang + "  author  " + author+ "]" );
	}
}
