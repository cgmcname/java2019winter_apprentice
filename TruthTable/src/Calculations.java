
public class Calculations {

	
	/**
	 * The Method modifyBool changes a boolean value true/false into a string value T/F
	 * @author Christopher McNames
	 * @param x Is the truth value for a given expression
	 * @return String value mod (T/F)
	 */
	public String modifyBool(boolean x) {

		char letter;
		String mod = Boolean.toString(x);

		letter = mod.toUpperCase().charAt(0);
		
		mod = Character.toString(letter);

		return mod;

	}

	public String findAnd(boolean a, boolean z) {

		String letter;
		boolean eval;

		eval = a & z;

		letter = modifyBool(eval);

		return letter;

	}
	
	public String findOr(boolean a, boolean z) {

		String letter;
		boolean eval;

		eval = a | z;

		letter = modifyBool(eval);

		return letter;

	}
	
	public String findAndShortCut(boolean a, boolean z) {

		String letter;
		boolean eval;

		eval = a && z;

		letter = modifyBool(eval);

		return letter;

	}
	
	public String findOrShortCut(boolean a, boolean z) {

		String letter;
		boolean eval;

		eval = a || z;

		letter = modifyBool(eval);

		return letter;

	}
	
	public String findXor(boolean a, boolean z) {

		String letter;
		boolean eval;

		eval = a ^ z;

		letter = modifyBool(eval);

		return letter;

	} 

}
