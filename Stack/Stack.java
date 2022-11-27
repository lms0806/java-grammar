import java.util.Stack;

public class Main {
	public static void add(Stack<Integer> stack, int n) {
		stack.add(n);
	}
	
	public static int get(Stack<Integer> stack, int index) {
		return stack.get(index);
	}
	
	public static boolean contains(Stack<Integer> stack, int n) {
		return stack.contains(n);
	}
	
	public static void clear(Stack<Integer> stack) {
		stack.clear();
	}
	
	public static int size(Stack<Integer> stack) {
		return stack.size();
	}
	
	public static int Stack_pop(Stack<Integer> stack){
		return stack.pop();
	}
	
	public static int Stack_not_pop(Stack<Integer> stack){
		return stack.peek();
	}
	
	public static boolean Stack_Empty(Stack<Integer> stack){
		return stack.isEmpty();
	}
}