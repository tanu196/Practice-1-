import java.util.ArrayList;
public class BookReviewWriter {
	public static void main(String[] args) {
	String fileName = "bookelist.txt";
	
	ArrayList<BookReview>books = new ArrayList<>();
		BookReview book1 = new BookReview("ハリーポッター" ,"魔法の世界に引き込まれた！続きが気になる");
		books.add(book1);
		
		 books.add(new BookReview("夜は短し歩けよ乙女", "独特な文体が面 白い。京都に行きたくなった"));
		 
		 books.add(new BookReview("嫌われる勇気", "アドラー心理学が分かりやすく学べた。考え方が変わった"));
		 
		 
	}
}
