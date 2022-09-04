package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=13;
		boolean bPrime=true;
		for (int i=2;i<number;i++) {
			if(number%i==0) {
				System.out.println("The Number is Composite");
				bPrime=false;
				break;
			}	
		}
		if(bPrime==true) {
			System.out.println("The Number is Prime");
		}
			
			
	}

}
