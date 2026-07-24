import java.util.ArrayDeque;
import java.util.Queue;

public class Exp72_1 {
	public static void main(String[] args) {

		//キュー構造を用いるとき
		//入れた順番から取り出せる
		Queue<String> queue = new ArrayDeque<>();
		queue.add("S");
		queue.add("E");
		queue.add("D");
		queue.offer("C");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}

}
