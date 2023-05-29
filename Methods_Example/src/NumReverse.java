
public class NumReverse {
	public static void main( String args[]) {
//		int n = 25413 ;
		int rev = 0 ;
//		while (n > 0) {
//			int rem = n % 10;
//			n= n / 10;
//			rev = rev * 10 + rem ;
//			
//			
//			
//		}
		
		for (int n = 25413 ; n > 0 ; n /= 10) {
			int rem = n % 10;
			rev = rev * 10 + rem ;
		}
		System.out.println(rev);
	}
}
