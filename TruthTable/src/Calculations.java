
public class Calculations {

	

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
