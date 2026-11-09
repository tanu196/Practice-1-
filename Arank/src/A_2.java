import java.util.Arrays;
import java.util.Comparator;
public class A_2 {
	public static void main(String[] args) {
		Integer[] arr = {5 , 3 , 8 ,1 ,4 };
		
		Arrays.sort(arr , Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		//Comparatorが指定できるのは参照型の配列しかダメ
	}
}
