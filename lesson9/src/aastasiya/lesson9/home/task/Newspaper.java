package aastasiya.lesson9.home.task;

public class Newspaper extends PrintPatter {
	private String type;

	public Newspaper(String title, int year, int pages, String lang, String type) {
		super(title, year, pages, lang);
		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void show () {
		System.out.println("[" + "  title   " + title + "  year  "+ year + "  pages  "+pages +   "lang  "+ lang + "  type  " + type + "]" );
	}
}
