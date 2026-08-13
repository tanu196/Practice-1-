public class Program2 {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt(args[0]);
			System.out.println("入力値" + value);
		}catch(NumberFormatException e){
			System.out.println("入力データが不正です");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("入力データが不正です");
		}
		
		
		
		
	}

}
