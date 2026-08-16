public class GenericSwap {
	public static <T> void swap(Box<T> box1, Box<T> box2) {
		T temp = box1.getValue();
		box1.setValue(box2.getValue());
		box2.setValue(temp);
	}
	public static void main(String[] args) {
		Box<Integer> intBox1 = new Box<>(10);
		Box<Integer> intBox2 = new Box<>(20);
		
		swap(intBox1 , intBox2);
		System.out.println(intBox1.getValue());
		System.out.println(intBox2.getValue());
	}
	
}
