package jp.ac.uhe.library.model;

public class Magazine {
	private String title;
	private int issue;
	
	public Magazine(String title , int issue) {
		this.title = title;
		this.issue =issue;
	}
	
	public void showInfo() {
		System.out.println("雑誌：" + title + "　第" + issue + "号");
	}
	

}
