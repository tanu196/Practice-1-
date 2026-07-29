import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
public class Exp72_4 {
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("ラーメン");
		hashSet.add("レモンティー");
		hashSet.add("野菜");
		
		System.out.println(hashSet);
		
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("アニメ");
		treeSet.add("石丸");
		treeSet.add("たぬき");
		treeSet.add("カフェ");
		
		System.out.println(treeSet);
		
		Deque<String> stack = new ArrayDeque<>();
		stack.push("N");
		stack.push("K");
		stack.push("W");
		stack.push("A");
		stack.push("d");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
		
		Queue<String> queue = new ArrayDeque();
		queue.add("S");
		queue.add("F");
		queue.add("D");
		queue.add("A");
		
		System.out.println(queue);
	}

}
