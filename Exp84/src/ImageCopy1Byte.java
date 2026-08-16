import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageCopy1Byte {
	public static void main(String[] args) {
		String sourceFile = "1MB.jpg";
		String destFile = "coopy1MB.jpg";
		
		
		try(FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile);){
			
			int date;
			while((date = fis.read()) != -1) {
				fos.write(date);
			}
			
			
			System.out.println("1バイトずつコピー完了");
			
		}catch(IOException e) {
			System.out.println("エラー" + e.getMessage());
		}
	}
}
