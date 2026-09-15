import java.io.FileReader;
import java.io.IOException;
public class Silver5 {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("Sample.txt");
			
			char date ;
			while((date = (char) fileReader.read()) != -1) {
				System.out.println(date);
			}
			
			fileReader.close();
			
		}catch(IOException e) {
			System.out.println("ファイルの入出力に失敗しました");
		}
	}
}