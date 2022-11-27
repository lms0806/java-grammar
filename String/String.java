import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static int String_len(String s) {
		return s.length();
	}
	
	public static char String_first_word(String s) {
		return s.charAt(0);
	}
	
	public static int String_to_int(String s) {
		return Integer.parseInt(s);
	}
	
	public static boolean Check_start_string(String a, String b) {
		return a.startsWith(b);
	}
	
	public static boolean Check_end_string(String a, String b) {
		return a.endsWith(b);
	}
	
	public static String[] Split_string(String s) {
		return s.split("");
	}

	public static String String_words_gather(String[] s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length; i++) {
			sb.append(s[i]).append("\n");
		}
		
		return sb.toString();
	}
	
	public static ArrayList<String> Split_string_blank(String s) {
		StringTokenizer st = new StringTokenizer(s);
		
		ArrayList<String> arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		
		return arr;
	}
}