import java.util.ArrayList;
import java.util.Collections;
public class Exp67_4 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 1 ; i <= 50 ; i++ ) {
			if(i % 3== 0) {
				num.add(i*2);
			}
		}
		Collections.sort(num,Collections.reverseOrder());
		System.out.print(num + " ");
		
		
		
	}

}
