import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Exp67_6 {

	public static void main(String[] args) {
		ArrayList<String> num2 = new ArrayList<>();
		ArrayList<String> num3 = new ArrayList<>(Arrays.asList("おにぎり" , "なむなむ"));
		num2.add("なにかあるか");
		num2.add("かな");
		System.out.println(num2);
		System.out.println(num3);
		
		Collections.sort(num3);
		System.out.println(num3);
		Collections.sort(num2);
		System.out.println(num2);
		Collections.sort(num2,Collections.reverseOrder());
		System.out.println(num2);
		Collections.sort(num3,Collections.reverseOrder());
		System.out.println(num3);
	}

}
