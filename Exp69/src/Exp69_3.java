import java.util.ArrayList;
import java.util.Iterator;
public class Exp69_3 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		for(int i = 1 ; i <= 15 ; i++) {
			num.add(i);
		}
		System.out.println(num);
//		Iterator<Integer> it = num.iterator();
//		
//		while(it.hasNext()) {
//			Integer value = it.next();
//			if(value % 2 == 0) {
//				it.remove();
//			}
//		}
		
		Iterator<Integer> it = num.iterator();
		
		while(it.hasNext()) {
			Integer value = it.next();
			if(value % 2 == 0) {
				it.remove();
			}
		}
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
