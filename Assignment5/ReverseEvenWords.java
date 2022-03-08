package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String mainString = "I am a software tester";

		String[] str = mainString.split(" "); // splits string by spaces and stores in string array

		String revString = "";

		String[] oddWords = new String[str.length];

		for (int i = 0; i <= str.length - 1; i++)// iterate to get even words

		{
			if (i % 2 != 0) {
				String rev = "";
				char[] arr = str[i].toCharArray();

				for (int j = arr.length - 1; j >= 0; j--) {// reverse obtained even words
					rev = rev + arr[j];
				}
				System.out.println(rev);
				revString = revString + rev + "";// revString contains all even words reversed and concatenated

			}
			oddWords[i] = str[i].concat(" ");

		}
		System.out.println("Reverse of Even words - " + revString);

		String rev1 = revString.substring(0, 2);// has reverse of 1st even word
		String rev2 = revString.substring(2, 10);// has reverse of 2nd even word
		System.out.println("Reverse of 1st even word - " + rev1);
		System.out.println("Reverse of 2nd even word - " + rev2);

		for (int a = 0; a <= oddWords.length - 1; a++) {
			if (a % 2 == 0) {
				System.out.println(oddWords[a].concat(" ")); // prints odd words
			}

			else {
				if (a < 2)
					System.out.println(rev1.concat(" ")); // prints 1st even word

				else
					System.out.println(rev2.concat(" ")); // prints 2nd even word
			}
		}

	}

}
