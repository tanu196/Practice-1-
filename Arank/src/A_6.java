import java.util.Arrays;

public class A_6 {
	public static void main(String[] args) {
		
		String[] words = {"banana", "cat", "apple", "dog", "elephant"};
		
		Arrays.sort(words , (a , b) -> Integer.compare(a.length(), b.length()));
		
		System.out.println(Arrays.toString(words));
		
		
	}
}