class SuperClass{
	void method() {
		System.out.println("SuperClass");
	}
}

class SubClass extends SuperClass{
	void method() {
		System.out.println("SubClass");
	}
}

public class Main extends Object {
	public static void main(String[] args) {
		SuperClass sc = new SubClass();
	}

}
