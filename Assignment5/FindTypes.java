package week3.day1;

public class FindTypes {

	public static void main(String[] args) {

		String givenString = "$$ Welcome to 2nd Class of Automation $$";
		int letter = 0, digit = 0, space = 0, specialChar = 0;

		// char [] arrayChar = new char[givenString.length()];
		char[] arrayChar = givenString.toCharArray();

		for (int i = 0; i <= givenString.length() - 1; i++) {
			if (Character.isLetter(arrayChar[i])) {
				letter++;
			}

			else if (Character.isDigit(arrayChar[i])) {
				digit++;
			}

			else if (Character.isSpaceChar(arrayChar[i])) {
				space++;
			} else {
				specialChar++;
			}

		}

		System.out.println("Characters - " + letter);
		System.out.println("Digits - " + digit);
		System.out.println("Spaces - " + space);
		System.out.println("Special Characters - " + specialChar);

	}

}
