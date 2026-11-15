import java.util.HashMap;

public class A_8 {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		
		map.put("田中", 1);
		map.put("加茂", 2);
		map.put("佐々木", 3);
		
		System.out.println(map.get("田中"));
		System.out.println(map.get(２));
		
		System.out.println(map.containsKey("田中"));
		System.out.println(map.containsKey("たｍｍｊ"));
		
		System.out.println();
		
		
	}
}