package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] words=	test.split(" ");
		for(int i=0;i<words.length;i++) {
			if(i%2==0) {
					StringBuilder sb=new StringBuilder(words[i]);	
					System.out.print(sb.reverse()+ " ");
				}
			else {
				System.out.print(words[i] + " ");
				
			}
		}
}
}