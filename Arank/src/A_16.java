import java.util.ArrayList;
import java.util.HashMap;
public class A_16 {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 2, 5, 2, 3, 5};
		HashMap<Integer , Integer> hashmap = new HashMap<>();
		
		//kye:数字　value:回数
		for(int x : arr) {
			if(hashmap.containsKey(x)) {
				hashmap.put(x , hashmap.get(x)+1);
			}else {
				hashmap.put(x, 1);
			}	
		}
		
//		Set<Integer> numbers = new HashSet<>();
//		for(int x : arr) {
//			numbers.add(x);
//		}
//		
		ArrayList<Integer> list = new ArrayList<>(hashmap.keySet());
		
		int maxCount = 0;
		int answer = Integer.MAX_VALUE; //Integerの最大値
		
		for(int i = 0 ; i < list.size(); i++) {
			int number = list.get(i);
			int count = hashmap.get(number);
			
			if(count > maxCount) {
				maxCount = count;
				answer = number;
			}else if(count == maxCount) {
				if(number < answer) {
					answer = number;
				}
			}
		}
		
		System.out.println(answer);
		
		
		
		
		
		
	}
}