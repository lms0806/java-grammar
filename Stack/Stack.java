import java.util.Stack;

public class Main {
	public static void add(Stack<Integer> stack, int n) {
		stack.add(n);
	}// 주어진 스택에 추가
	
	public static int get(Stack<Integer> stack, int index) {
		return stack.get(index);
	}// 스택의 index번째 값 출력
	
	public static boolean contains(Stack<Integer> stack, int n) {
		return stack.contains(n);
	}// 스택에 n이 포함되어 있는지 체크
	
	public static void clear(Stack<Integer> stack) {
		stack.clear();
	}// 스택 비우기
	
	public static int size(Stack<Integer> stack) {
		return stack.size();
	}// 스택의 크기
	
	public static int Stack_pop(Stack<Integer> stack){
		return stack.pop();
	}// 스택에 값 빼기
	
	public static int Stack_not_pop(Stack<Integer> stack){
		return stack.peek();
	}// 스택에 값을 빼지 않고 확인
	
	public static boolean Stack_Empty(Stack<Integer> stack){
		return stack.isEmpty();
	}// 스택이 비어있는지 확인
}