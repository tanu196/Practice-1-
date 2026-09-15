import java.io.FileReader;
import java.io.IOException;
public class Silver6 {
	public static void main(String[] args) {
		FileReader reader = null;
		
		try {
			reader = new FileReader("Sample.txt");
			
			int date;
			while((date = reader.read()) != -1){
				System.out.println((char)date);
			}
			
		}catch (IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
		}finally {
			if(reader != null) {
				try {
					reader.close();
				}catch(IOException e) {
					System.out.println("ファイルを閉じられませんでした");
					System.exit(0);
				}
			}
		}
		
		
		
	}
}
