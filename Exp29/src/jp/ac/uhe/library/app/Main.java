package jp.ac.uhe.library.app;
import jp.ac.uhe.ac.library.model.Book;
import jp.ac.uhe.library.model.Magazine;
import jp.ac.uhe.library.model.media.Dvd;
public class Main {

	public static void main(String[] args) {
		Book book = new Book("コンストラクターチェーンソーマン" , "藤木タシキ");
		book.showInfo();
		Magazine m1 = new Magazine("『週刊少年Eclipse』" , 12);
		m1.showInfo();
		Dvd dvd = new Dvd("『燃えよオブジェクト指向』 / " , 58);
		dvd.showInfo();
	}

}
