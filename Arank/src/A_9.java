import java.util.HashMap;

public class A_9 {
	public static void main(String[] args) {
		String str = "banana";
		
		HashMap<String , Integer> map = new HashMap<>();
		map.put("田中", 80);
		map.put("佐藤", 95);
		map.put("鈴木", 70);
		
		System.out.println(map.get("佐藤"));
		
		
		
	}
}