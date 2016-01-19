import java.math.*;

public class Enc_decr {

	private static int firstKey = 5;
	private static int secondKey = 19;
	private static int module = 26;

	// ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz

	static String encrypt(String input) {
		StringBuilder builder = new StringBuilder();
		for (int in = 0; in < input.length(); in++) {
			char character = input.charAt(in);

			if (character != ' ') {
				if (Character.isLowerCase(character)) {
					character = (char) ((((firstKey * (character - 'a') + secondKey) % module) + 'a'));
				} else {
					character = (char) ((((firstKey * (character - 'A') + secondKey) % module) + 'A'));
				}
			}
			builder.append(character);
		}
		return builder.toString();
	}

	static String decrypt(String input) {
		StringBuilder builder = new StringBuilder();

		BigInteger inverse = BigInteger.valueOf(firstKey).modInverse(
				BigInteger.valueOf(module));

		for (int in = 0; in < input.length(); in++) {
			char character = input.charAt(in);
			if (Character.isLetter(character)) {

				if (Character.isLowerCase(character)) {
					character = (char) (inverse.intValue()
							* (character - 'a' - secondKey + module) % module + 'a');
				} else {
					character = (char) (inverse.intValue()
							* (character - 'A' - secondKey + module) % module + 'A');
				}

			}
			builder.append(character);
		}
		return builder.toString();
	}

}
