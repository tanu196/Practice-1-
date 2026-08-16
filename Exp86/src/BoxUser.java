public class BoxUser {
	public static void main(String[] args) {
		Box<String> stringBox = new Box<String>();
		stringBox.set("Hello , Generics!");
		String message = stringBox.get();
		System.out.println(message);
		
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(2025);
		Integer year = integerBox.get();
		System.out.println(year);
	}
}
