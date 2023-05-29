import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int col , row;
		int[][] arr = new int[10][4];
		int [][] arr2 = new int[10][4];
		
//		for(int[] num : arr) {
//			System.out.println(Arrays.toString(arr));
//		}
		
		for(row = 0 ; row<3 ; row++) {
			for(col = 0 ; col<4 ; col++) {
			}
			System.out.println(Arrays.toString(arr[row]));
		}
//		System.out.println(Arrays.toString(arr));
	}

}
