package jp.ac.uhe.ac.library.model;

public class Book {
	private String title;
	private String author;
	
	public Book(String title , String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("書籍：" + title + "/著作名：" + author);
	}
	
	
	
	
	
	
	
	
	
	
	
}
