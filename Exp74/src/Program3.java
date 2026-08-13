public class Program3 {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt(args[0]);
			System.out.println("入力値" + value);
		}catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("入力データが不正です");
		}
		
		
	}

}
