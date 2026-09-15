import java.io.FileReader;
import java.io.IOException;
public class Silver7 {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("Sample.txt")){
			
			int date;
			
			while((date = reader.read()) != -1) {
				System.out.println((char)date);
			}
			
			
		}catch(IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
		}
		
		
	}
}
