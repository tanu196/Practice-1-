import java.util.HashSet;
public class A_11 {
	public static void main(String[] args) {
		int[] arr = {3, 7, 2, 9, 7, 5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int x : arr) {
			if(!set.add(x)) {
				System.out.println("重複発見" + x);
			}
		}
	}
}