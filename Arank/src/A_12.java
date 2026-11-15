import java.util.HashSet;
public class A_12 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : arr) {
			set.add(n);
		}
		System.out.println(set.size());
		
	}
}