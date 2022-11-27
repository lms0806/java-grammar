import java.math.BigInteger;

public class Main {
	public static BigInteger int_to_BigInteger(int n) {
		return BigInteger.valueOf(n);
	}
	
	public static BigInteger String_to_BigInteger(String s) {
		return new BigInteger(s);
	}
	
	public static String ten_to_sixteen(BigInteger n) {
		return n.toString(16);
	}
	
	public static BigInteger add(int a, int b) {
		return int_to_BigInteger(a).add(int_to_BigInteger(b));
	}
	
	public static BigInteger minus(int a, int b) {
		return int_to_BigInteger(a).min(int_to_BigInteger(b));
	}
	
	public static BigInteger mul(int a, int b) {
		return int_to_BigInteger(a).multiply(int_to_BigInteger(b));
	}
	
	public static BigInteger divide(int a, int b) {
		return int_to_BigInteger(a).divide(int_to_BigInteger(b));
	}
}