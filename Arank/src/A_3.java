import java.util.Arrays;

public class A_3 {
	public static void main(String[] args) {
		Integer[] arr = {-8, 3, -2, 10, -5};
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = Math.abs(arr[i]);
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		System.out.println(Integer.compare(3, 8));
		
		//正解は以下の通り
		Arrays.sort(arr , (a , b) -> Integer.compare(Math.abs(a), Math.abs(b)));
		System.out.println(Arrays.toString(arr));
		
		
		

		
	}
}