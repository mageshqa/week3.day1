package week3.day1;

import java.util.Arrays;

public class StringPlay {

	public void stringLength(String text1, String text2) {
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1 == length2) {
			System.out.println("Length of both strings are same");
		}

	}

	public void stringToChar(String text1, String text2) {
		char[] charText1 = new char[text1.length()];
		char[] charText2 = new char[text2.length()];

		for (int i = 0; i < text1.length() - 1; i++) {
			charText1[i] = text1.charAt(i);
			System.out.println(charText1[i]);
			System.out.println("Converted String " + text1 + " to character -> " + charText1[i]);

		}

		for (int j = 0; j < text2.length() - 1; j++) {
			charText2[j] = text2.charAt(j);
			System.out.println(charText2[j]);
			System.out.println("Converted String " + text2 + " to character -> " + charText2[j]);

		}

	}

	public void stringToArray(String text1, String text2) {
		char[] charText1 = new char[text1.length()];
		char[] charText2 = new char[text2.length()];

		charText1 = text1.toCharArray();
		charText2 = text2.toCharArray();

		Arrays.sort(charText1);
		Arrays.sort(charText2);

		for (int i = 0; i < text1.length(); i++) {
			System.out.println(charText1[i]);

		}

		for (int j = 0; j < text2.length(); j++) {
			System.out.println(charText2[j]);

		}

		if (Arrays.equals(charText1, charText2))
			System.out.println("Both Arrays has same values");

		else
			System.out.println("Both Arrays are different");

	}

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "topss";

		StringPlay strLen = new StringPlay();

		strLen.stringLength(text1, text2);
		strLen.stringToChar(text1, text2);
		strLen.stringToArray(text1, text2);

	}

}
