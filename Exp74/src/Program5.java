public class Program5 {
	public static void main(String[] args) {
		try {
			System.out.println("x");
			int value = Integer.parseInt(args[0]);
			System.out.println(value);
		}catch(NumberFormatException e) {
			System.out.println("cathc");
		}finally {
			System.out.println("y");
		}
		System.out.println("z");
		
		
	}

}
