import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Exp67_5 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(34);
		num.set(0, 12);
		num.remove(0); 
		
		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(12 ,34));
		Collections.sort(num1,Collections.reverseOrder());
		System.out.println(num1);
		Collections.sort(num1);
		System.out.println(num1);
		
		
		

	}

}
