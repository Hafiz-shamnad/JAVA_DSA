import java.util.Scanner;

public class NumOccurance {

	public static void main(String[] args) {
//		Scanner in = new Scanner ( System.in );
//		System.out.println("Enter the series of numbers");
//		
//		String str  = in.nextLine();
//		String[] arr = str.split(",");
//		
//		
//		System.out.println("Enter the number to find occurance");
//		String match = in.nextLine();
//		
//		
//		int count = 0;
//		
//		for (int i = 0 ; i<arr.length ; i++) {
//			System.out.println(arr[i]);
//			if (arr[i] == match) {
//				System.out.println("Occurance occured : ");
//				count++;
//			}
//		}
//		
//		System.out.println("Occurance occured : " + count);
//	}
		
		int n= 4455566;
		int count = 0 ;
		while (n>0) {
//			int rem = n % 10 ;
				count++;
			n /= 10 ; 
		}
		System.out.println(count);
	}
}
