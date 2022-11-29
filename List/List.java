import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static int size(ArrayList<Integer> arr) {
		return arr.size();
	}// 리스트의 크기
	
	public static void input(ArrayList<Integer> arr, int n) {
		arr.add(n);
	}// 리스트에 값 추가
	
	public static int output(ArrayList<Integer> arr, int index) {
		return arr.get(index);
	}// 리스트 index위치 값 가져오기
	
	public static void clear(ArrayList<Integer> arr) {
		arr.clear();
	}// 리스트 비우기
	
	public static boolean Empty_check(ArrayList<Integer> arr) {
		return arr.isEmpty();
	}// 리스트가 비어있는지 체크
	
	public static Object clone(ArrayList<Integer> arr){
		return arr.clone();
	}// 리스트와 주소값이 다른 리스트 생성(clone)
	
	public static boolean contains(ArrayList<Integer> arr, int n) {
		return arr.contains(n);
	}// 리스트에 해당 값이 있는지 체크
	
	public static int indexOf(ArrayList<Integer> arr, int n) {
		return arr.indexOf(n);
	}// 리스트의 n이 있는 위치 가져오기, 없을 경우 -1
	
	public static void sort(ArrayList<Integer> arr) {
		Collections.sort(arr);
	}// 리스트 정렬
}