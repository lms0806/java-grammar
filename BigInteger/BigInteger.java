import java.math.BigInteger;

public class Main {
	public static BigInteger int_to_BigInteger(int n) {
		return BigInteger.valueOf(n);
	}// int를 BigInteger로 변환
	
	public static BigInteger String_to_BigInteger(String s) {
		return new BigInteger(s);
	}// String을 BigInteger로 변환
	
	public static String ten_to_sixteen(BigInteger n) {
		return n.toString(16);
	}// BigInteger로 된 숫자를 16진수로 변환
	
	public static BigInteger add(BigInteger a, BigInteger b) {
		return a.add(b);
	}// 합
	
	public static BigInteger minus(BigInteger a, BigInteger b) {
		return a.min(b);
	}// 빼기
	
	public static BigInteger mul(BigInteger a, BigInteger b) {
		return a.multiply(b);
	}// 곱
	
	public static BigInteger divide(BigInteger a, BigInteger b) {
		return a.divide(b);
	}// 나누기
}