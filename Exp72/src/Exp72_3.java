import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Exp72_3 {
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		hashSet.add("cherry");
		hashSet.add("apple");
		hashSet.add("banana");
		
		System.out.println(hashSet);//hashは並び順保証されてないからわからない
		
		treeSet.add("cherry");
		treeSet.add("apple");
		treeSet.add("banana");
		
		System.out.println(treeSet);//treeは昇順に入れ替えられる
		
		boolean result = treeSet.add("apple");
		boolean result2 = treeSet.add("ぬみ￥");
		System.out.println(result);
		System.out.println(result2);
		
		
		
	}

}
