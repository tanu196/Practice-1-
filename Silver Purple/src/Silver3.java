public class Silver3 {
	public static void main(String[] args) {
		StringBuilder num = new StringBuilder();
		StringBuilder num2 = new StringBuilder("Asita");
		num.append("Line");
		System.out.println(num);
		
		num.append("kiwi");
		System.out.println(num);
		
		num.delete(6, 10);
		System.out.println(num);
		
		num.insert(6, "Lemon");
		System.out.println(num);
		
		int n = num.capacity();
		System.out.println(n);
		
		String str = num.toString();
		System.out.println(str);
	}
}
