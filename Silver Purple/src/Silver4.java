public class Silver4 {
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		
		int x = 6^4;
		
		System.out.println(x);
		
		if(a ^ b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		
		String s1 = "Java";
		String s4 = s1.intern();
		System.out.println(s1 == s4);
		
		
		StringBuilder sb1 = new StringBuilder("James");
		StringBuilder sb2 = new StringBuilder("James");
		
		System.out.println(s1.equals(sb2));  //false
		System.out.println(sb1 == sb2);  //false
		String sb3 = sb1.toString();
		String sb4 = sb2.toString();
		System.out.println(sb3.equals(sb4));
		
		
		
	}
}
