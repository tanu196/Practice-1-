import java.util.Stack;

public class A_15 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("A");		
		stack.add("B");
		stack.add("C");
		stack.add("D");
		stack.add("E");
		
		while(!stack.isEmpty())
		System.out.print(stack.pop());
	}
}