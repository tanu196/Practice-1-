import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exp72_5 {
	public static void main(String[] args) {
		ArrayList<Map<String , String>> list = new ArrayList<>();
		
		Map<String , String> person1 = new HashMap<>();
		person1.put("name", "Taro");
		person1.put("age", "20");
		
		Map<String , String> person2 = new HashMap<>();
		person2.put("name", "Hanako");
		person2.put("age", "18");
		
		list.add(person1);
		list.add(person2);
		
		System.out.println(list);
	}

}
