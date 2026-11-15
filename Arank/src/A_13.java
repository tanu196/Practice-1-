import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
public class A_13 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {3, 4, 4, 5, 6};
		
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int x : a) {
			set.add(x);
		}
		
		for(int y : b) {
			set.add(y);
		}
		
		ArrayList<Integer> list = new ArrayList<>(set);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
				
		
	}
}