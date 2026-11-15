import java.util.HashSet;
import java.util.Set;
public class A_17 {
	public static void main(String[] args) {
		int[] arr = {4, 7, 1, 9, 3, 6};
		int k = 10;
		
		
		Set<Integer> hashset = new HashSet<>();
		boolean found = false;
		
		
		for(int x : arr) {
			int target = k-x;
			
			if(hashset.contains(target)) {
				found = true;
				break;
			}
			
			hashset.add(x);
		}
		
		
		System.out.println(found? "Yes" : "NO");
		
		
		
		
		
		
		
		
	}
}