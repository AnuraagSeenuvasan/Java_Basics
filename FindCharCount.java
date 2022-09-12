package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String str = "cognizant";
		char ch = 'c';
		int count = 0;
		char[] charArray = str.toCharArray();
		for (i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == ch) {
				count++;
			}
		}
		System.out.println("The word "+ ch + " has occured " + count + " time's");

	}

}
