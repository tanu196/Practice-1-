import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	public static void main(String[] args) {
		File file = new File("memo.txt");
		try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);

		) {

			bw.write("一行目の文章です");
			bw.newLine();

			bw.write("２行目の文章です");
			bw.newLine();

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
