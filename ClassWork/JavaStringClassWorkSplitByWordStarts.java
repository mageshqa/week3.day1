package week3.day1;

public class JavaStringClassWorkSplitByWordStarts {

	public static void main(String[] args) {

		String testLeaf = "Testleaf is location in Teynampet and above taccobell";

		String[] temp = testLeaf.split(" ");

		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[j]);
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i].startsWith("T") || temp[i].startsWith("t")) {
				System.out.println(temp[i]);
			}

		}
	}

}
