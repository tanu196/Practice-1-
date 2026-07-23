import java.util.ArrayDeque;
import java.util.Queue;

public class Exp72_1 {
	public static void main(String[] args) {
		
		Queue<String>queue = new ArrayDeque<>();
		queue.add("S");
		queue.add("E");
		queue.add("D");
		queue.offer("C");
		System.out.println(queue);
		System.out.println(queue.peek());
		
		
	}

}
