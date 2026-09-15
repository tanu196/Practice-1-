import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Silver8 {
	public static void main(String[] args) {
		
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(
						new File("Sample.txt")));){
			
			//new ○○などの右辺を次のクラスのカッコの中に入れると連続でインスタンス化でき、便利
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		}catch(IOException e) {
			System.out.println("ファイル処理に失敗しました");
		}
	}
}
