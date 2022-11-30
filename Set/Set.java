import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static int size(HashSet<Integer> set) {
		return set.size();
	}// set의 크기 반환
	
	public static void clear(HashSet<Integer> set) {
		set.clear();
	}// set 비우기
	
	public static boolean isEmpty(HashSet<Integer> set) {
		return set.isEmpty();
	}// set이 비어있는지 확인
	
	public static void add(HashSet<Integer> set, int n) {
		set.add(n);
	}// set에 n 추가
	
	public static void remove(HashSet<Integer> set, int n) {
		set.remove(n);
	}// set에 n이 있으면 제거
	
	public static void print(HashSet<Integer> set) {
		Iterator<Integer> iter = set.iterator();
		
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()) {
			sb.append(iter.next());
		}
		System.out.print(sb);
	}// set에 있는 값들 출력
	
	public static boolean contains(HashSet<Integer> set, int n) {
		return set.contains(n);
	}// set에 n이 있는지 확인
	
	public static int first_treeset(TreeSet<Integer> set, int n) {
		return set.first();
	}// set의 처음값 출력(treeset)
	
	public static int last_treeset(TreeSet<Integer> set, int n) {
		return set.last();
	}// set의 마지막값 출력(treeset)
}