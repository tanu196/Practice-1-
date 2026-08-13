import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			System.out.println(input);
		}catch(Exception e) {
			System.out.println("入力データが不正です");
		}finally {
			sc.close();
		}
		
		
		
		
		
		
	}

}
