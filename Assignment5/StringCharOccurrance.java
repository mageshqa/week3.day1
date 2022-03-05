package week3.day1;

public class StringCharOccurrance {

	public static void main(String[] args) {

		String str = "Welcome to Chennai";
		int counter[] = new int[str.length()];
		// char strChar[] = new char[str.length()];

		char strChar[] = str.toCharArray();

		for (int i = 0; i <= str.length() - 1; i++) {
			counter[i]++;

			for (int j = i + 1; j <= str.length() - 1; j++) {

				if (strChar[i] == strChar[j]) {
					counter[i]++;
					strChar[j] = 0;

				}
			}

		}

		for (int i = 0; i <= counter.length - 1; i++) {
			if (strChar[i] != ' ' && strChar[i] != '0')
				System.out.println("Character " + strChar[i] + " has Frequency " + counter[i]);
		}

	}

}
