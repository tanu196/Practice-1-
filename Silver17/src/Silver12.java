public class Silver12 {
	public static void main(String[] args) {
		String num = new String("明日");
		
		String num2 = num.intern();
		
		String num3 = new String("明" + "日");
		
		String num4 = num3.intern();
		
		System.out.println(num3 == num2);
		
		var var = 223;
	}
}




class Asto{
	
	public void monument() {
		return;
	}
	
}
