


import java.math.BigInteger;

public class BigDecimalAndBigInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger santeMonicaCondo = new BigInteger("10000000");
		BigInteger seattleCondo = new BigInteger("1000000000");
		BigInteger dcCondo = new BigInteger("532000000");
		BigInteger result = santeMonicaCondo.add(seattleCondo);
		System.out.println(result);
		BigInteger difference = dcCondo.subtract(seattleCondo);
		System.out.println(difference);
		BigInteger finale = result.multiply(difference);
		System.out.println(finale);
	}
}
