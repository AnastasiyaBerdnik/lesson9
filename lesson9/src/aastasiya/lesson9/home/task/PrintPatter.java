package aastasiya.lesson9.home.task;

public class PrintPatter {
	public String title;
	public int year;
	public int pages;
	public String lang;
	
	public PrintPatter(){
		
	}

	public PrintPatter(String title, int year, int pages, String lang) {
		this.title  = title;
		this.year = year;
		this.pages = pages;
		this.lang = lang;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public void show () {
		System.out.println("[" + "title   " + title + "year  "+ year + "pages  "+pages +"lang  "+lang + "]");
	}
	

}
