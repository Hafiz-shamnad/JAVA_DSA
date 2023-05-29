
import java.util.Scanner;

public class LinearSearchinStrings {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String target = in.nextLine();
		String[] str = new String[3];
		for (int i = 0 ; i <str.length; i++) {
		str[i] = in.nextLine();
		}
		
		linearsearch(str, target);
	}
	
	static void linearsearch(String[] str , String target) {
		int flag = 0;
		for (int i = 0 ; i <str.length ; i++) {
			
			if( target == str[i]) {
				System.out.println("Found at position :" + i);
				
			}else{
				flag++;
			}
		}
		if (flag == str.length) {
			System.out.println("Sorry Match not found !!!");
		}
	}
}
