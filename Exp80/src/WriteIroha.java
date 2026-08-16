import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteIroha {
	public static void main(String[] args) {
		File file = new File("Iroha.txt");
		try (FileWriter fw = new FileWriter(file);){
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("いろはにほへとちりぬるを");
			bw.newLine();
			
			bw.write("わかよたれそつねならむ");
			bw.newLine();
			
			bw.write("ういのおくやまけふこけて");
			bw.newLine();
			
			bw.write("あさきゆめみしえひもせすん");
			bw.newLine();
			
			bw.write("色はさかへどちりぬるを");
			bw.newLine();
			
			bw.write("我が世誰そ常ならむ ");
			bw.newLine();
			
			bw.write("有為の奥山今日越えて ");
			bw.newLine();
			
			bw.write("浅き夢見じ酔ひもせず");
			bw.newLine();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
