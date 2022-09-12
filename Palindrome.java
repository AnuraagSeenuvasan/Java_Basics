package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam", rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = str + rev.charAt(i);
		}
		if (rev.equals(str))
			System.out.println("The word is a Palindrome");
		else
			System.out.println("The word is not a Palindrome");

	}

}
