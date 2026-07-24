import java.util.ArrayDeque;
import java.util.Deque;
public class Exp72_2 {
	public static void main(String[] args) {
		
		
		//スタック構造　　出力するとき取り出す順になっている
		Deque<String> stack = new ArrayDeque<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
