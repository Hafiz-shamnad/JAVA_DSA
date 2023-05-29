import java.util.Arrays;
import java.util.Scanner;import javax.print.attribute.Size2DSyntax;

public class SearchIn2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int[][] arr = {
				{1,2,3,4},
				{12,13,14}, 
				{12,16,18}
		};
		search(arr ,target);
		System.out.println(minsearch(arr)); 
		System.out.println(maxsearch(arr)); 
	}
	static void search (int[][] arr ,int target) {
		int flag = 0;
		for(int row = 0 ; row<arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length; col++) {
				if(target == arr[row][col]) {
					System.out.println("Match found at position: " + row + " , " + col);
				}else {
					flag++; 
				}
			}
		}
		
		if (flag == 10 ) {
			System.out.println("No match Found !!!");
		}
	}
	
	static int minsearch (int[][] arr ) {
		int ans = arr[0][0];
		 for (int row = 0 ; row < arr.length ; row++ ) {
			 for (int col = 0 ; col < arr[row].length -1 ; col++ ) {
				 if ( ans > arr[col][row]) {
					 arr[col][row] = ans;
				 }
			 } 
		 }
		return ans ;
	}
	
	static int maxsearch (int[][] arr ) {
		int ans = arr[0][0];
		 for (int row = 0 ; row < arr.length ; row++ ) {
			 for (int col = 0 ; col < arr[row].length -1 ; col++ ) {
				 if ( arr[col][row] > ans) {
					  ans = arr[col][row] ;
				 }
			 } 
		 }
		return ans ;
	}
}
