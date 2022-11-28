import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static int String_len(String s) {
		return s.length();
	}// 문자열의 길이
	
	public static char String_first_word(String s) {
		return s.charAt(0);
	}// 문자열의 첫번째 문자
	
	public static int String_to_int(String s) {
		return Integer.parseInt(s);
	}// String을 int형으로 변환
	
	public static boolean Check_start_string(String a, String b) {
		return a.startsWith(b);
	}// a 문자열의 시작이 b랑 같은지 비교
	
	public static boolean Check_end_string(String a, String b) {
		return a.endsWith(b);
	}// a 문자열의 끝이 b랑 같은지 비교
	
	public static String[] Split_string(String s) {
		return s.split("");
	}// 문자열을 1글자 단위로 나눠서 배열에 저장

	public static String String_words_gather(String[] s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length; i++) {
			sb.append(s[i]).append("\n");
		}
		
		return sb.toString();
	}// 문자열 배열의 문자열들을 빠르게 모아서 출력
	
	public static ArrayList<String> Split_string_blank(String s) {
		StringTokenizer st = new StringTokenizer(s);
		
		ArrayList<String> arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		
		return arr;
	}// 입력받은 문자열을 공백단위로 나눠 리스트에 저장
}