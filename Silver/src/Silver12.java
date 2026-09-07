import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Silver12 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("D" , "U" , "K" , "E");
		
		Collections.reverse(list);
		System.out.println(list);
		
		int[] numArray = {1,5,3};
		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));
		int[] small = {1,3};
		int[] same = {1,3,5};
		int[] large = {5,3,1};
		
		System.out.println(Arrays.compare(numArray , small));
		System.out.println(Arrays.compare(numArray , same));
		System.out.println(Arrays.compare(numArray , large));
		System.out.println(Arrays.mismatch(numArray , small));
		System.out.println(Arrays.mismatch(numArray,same));
		
	}
}
