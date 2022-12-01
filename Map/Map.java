import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	public static void input(HashMap<String, Integer> map, String s, int n) {
		map.put(s, n);
	}// map에 s를 key, n을 value로 추가
	
	public static int size(HashMap<String, Integer> map) {
		return map.size();
	}// map의 크기 반환
	
	public static int get(HashMap<String, Integer> map, String s) {
		return map.get(s);
	}// map에 s의 value 반환
	
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