import java.util.Arrays;
public class A_5 {
	public static void main(String[] args) {
		Integer[] arr = {-4, 8, -10, 3, -2};
		
		Arrays.sort(arr , (a , b) -> Integer.compare(Math.abs(b) , Math.abs(a)));	
		System.out.println(Arrays.toString(arr));
		
	}
}