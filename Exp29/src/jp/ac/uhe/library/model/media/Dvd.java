package jp.ac.uhe.library.model.media;

public class Dvd {
	private String title;
	private int minutes;
	
	public Dvd(String title , int minutes) {
		this.title = title;
		this.minutes = minutes;
	}
	
	
	public void showInfo() {
		System.out.println("DVD:" + title + " " + minutes + "分");
	}
	
}
