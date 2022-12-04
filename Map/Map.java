import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	public static void input(HashMap<String, Integer> map, String s, int n) {
		map.put(s, n);
	}// map에 s를 key, n을 value로 추가
	
	public static void add2(HashMap<String, Integer> map, String[] str) {
		for(int i = 0; i < str.length; i++) {
			map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		}
	}// map에 str배열에 있는 문자열을 key로 저장
	// 이미 있는 값이면 1로 아니면 map에 있는 값 + 1
	// getOrDefault(찾을 값, 찾을 값이 없을 경우 주어질 값)
	
	public static int size(HashMap<String, Integer> map) {
		return map.size();
	}// map의 크기 반환
	
	public static int get(HashMap<String, Integer> map, String s) {
		return map.get(s);
	}// map에 s의 value 반환
	
	public static void values_print(HashMap<String, Integer> map) {
		Collection<Integer> arr = map.values();
		
		System.out.print(arr);
	}// map에 있는 모든 value값들을 Collections에 저장
	// Collections에 저장된 값들을 출력
	
	public static boolean contains_key(HashMap<String, Integer> map, String s) {
		return map.containsKey(s);
	}// map에 key로 s가 있는지 확인
	
	public static boolean contains_value(HashMap<String, Integer> map, int n) {
		return map.containsValue(n);
	}// map에 value로 n이 있는지 확인
	
	public static boolean isEmpty(HashMap<String, Integer> map) {
		return map.isEmpty();
	}// map이 비어있는지 확인
	
	public static void print(HashMap<String, Integer> map) {
		StringBuilder sb = new StringBuilder();
		for(String str : map.keySet()) {
			sb.append(str).append(" ").append(map.get(str));
		}
		System.out.print(sb);
	}// map에 있는 모든 key와 value 출력
	
	public static void print2(LinkedHashMap<String, Integer> map) {
		StringBuilder sb = new StringBuilder();
		for(String str : map.keySet()) {
			sb.append(str).append(" ").append(map.get(str));
		}
		System.out.print(sb);
	}// 순서를 보장하는 HashMap의 모든 key와 value 출력
	
	public static void sort_value(HashMap<String, Integer> map) {
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		
		entryList.sort(Map.Entry.comparingByValue());
		
		StringBuilder sb = new StringBuilder();
		for(String str : map.keySet()) {
			sb.append(str).append(" ").append(map.get(str));
		}
		System.out.print(sb);
	}// map을 key로 정렬한게 아닌 value로 정렬한 값을 출력
}