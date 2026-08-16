import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SampleBufferedReader {
	public static void main(String[] args) {
		try (

				BufferedReader br = new BufferedReader(new FileReader("todo.txt"));) {

		} catch (IOException e) {
			System.out.println("error");
		}
	}
}
