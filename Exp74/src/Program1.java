import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		boolean flag = false;
		while (!flag) {

			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("年齢を入力してください");
				int age = Integer.parseInt(sc.nextLine());
				System.out.println("あなたの年齢は" + age + "歳です");
				flag = true;

				sc.close();

			} catch (NumberFormatException e) {
				System.out.println("整数を入力してください");
			}
		}
	}

}
