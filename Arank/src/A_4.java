import java.util.Arrays;

public class A_4 {
	public static void main(String[] args) {
		Integer[] arr = {5, 2, 9, 1, 7};
		
		
		Arrays.sort(arr , (a , b) -> Integer.compare(b , a));
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}