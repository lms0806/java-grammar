import java.math.BigInteger;

public class Main {
	public BigInteger int_to_BigInteger(int n) {
		return BigInteger.valueOf(n);
	}
	
	public BigInteger add(int a, int b) {
		return int_to_BigInteger(a).add(int_to_BigInteger(b));
	}
	
	public BigInteger minus(int a, int b) {
		return int_to_BigInteger(a).min(int_to_BigInteger(b));
	}
	
	public BigInteger mul(int a, int b) {
		return int_to_BigInteger(a).multiply(int_to_BigInteger(b));
	}
	
	public BigInteger divide(int a, int b) {
		return int_to_BigInteger(a).divide(int_to_BigInteger(b));
	}
}