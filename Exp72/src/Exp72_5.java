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
		
		Map<String , String> person3 = new HashMap<>();
		person3.put("name", "Ikumu");
		person3.put("age", "18");
		
		Map<String , String> person4 = new HashMap<>();
		person3.put("name", "baun");
		person3.put("age", "13");
		
		Map<String , String> person5 = new HashMap<>();
		person3.put("name", "numa");
		person3.put("age", "10");
		
		
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		
		System.out.println(list);
		
		
	}

}
