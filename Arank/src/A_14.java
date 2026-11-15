import java.util.ArrayDeque;
import java.util.Queue;
public class A_14 {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(5);
		queue.offer(10);
		queue.offer(15);
		queue.add(5);
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(queue.poll());
		}
	}
}
