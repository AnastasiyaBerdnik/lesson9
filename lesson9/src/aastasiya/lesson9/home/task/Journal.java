package aastasiya.lesson9.home.task;

public class Journal extends PrintPatter {

	private String period;

	public Journal(String title, int year, int pages, String lang, String period) {
		super(title, year, pages, lang);
		this.period = period;

	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	@Override
	public void show () {
		System.out.println("[" + "  title   " + title + "  year  "+ year + "  pages  "+pages + "  lang  "+lang + "  period  " + period + "]" );
	}
}
