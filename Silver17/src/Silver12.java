public class Silver12 {
	public static void main(String[] args) {
		String num = new String("明日");
		
		String num2 = num.intern();
		
		String num3 = new String("明日");
		
		String num4 = num3.intern();
		System.out.println(num == num4);
		
		System.out.println(num2 == num4);
	}
}
