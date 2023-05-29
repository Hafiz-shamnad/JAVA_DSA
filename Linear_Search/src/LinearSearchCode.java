import java.util.Scanner;

public class LinearSearchCode {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int target = in.nextInt() ;
		
		int[] arr = new int[5];
		
		for ( int i = 0 ; i < arr.length ; i++) 
		{
			arr[i]= in.nextInt();		
		}
		
		linearSearch(arr , target);
		linearSearch2(arr , target);
		linearSearch3(arr , target);
		linearSearchInRange(arr, target);
		linearSearchMin(arr);
	}

	
	static void linearSearch( int[] arr , int target ) {
		
		int flag = 0 ;
				
		for (int i = 0 ; i < arr.length ; i++) 
		{
			if (target == arr[i])
			{
				i++;
				System.out.println("Match found at position : " + i);
			}
			else
			{
				flag ++;
			}
		}
		
		if ( flag == arr.length || arr.length == 0) 
		{
			System.out.println("Match not found !!");
		}
	}
static void linearSearch2( int[] arr , int target ) {
				
		for (int i = 0 ; i < arr.length ; i++) 
		{
		    int element = arr[i];
			if (target == element)
			{
				System.out.println("element is : " + element);
			}
		}
	}
static void linearSearch3( int[] arr , int target ) {
	boolean isTrue = true;
	boolean isFalse =false;
	int flag = 0;
	
	for (int i = 0 ; i < arr.length ; i++) 
	{
	    int element = arr[i];
		if (target == element)
		{
			System.out.println(isTrue);
		}
		else {
			flag++;
		}
	}
	if (flag == arr.length) {
		System.out.println(isFalse);
	}
}static void linearSearchInRange( int[] arr , int target ) {
	
	int upper_lim = 4 , lower_lim = 1 ; 
	int flag = 0;
	
	for (int i = lower_lim ; i < upper_lim ; i++) 
	{
	    int element = arr[i];
		if (target == element)
		{
			System.out.println("found at : " +i);
		}
		else {
			flag++;
		}
	}
	if (flag == upper_lim-lower_lim) {
		System.out.println(false);
	}
}static void linearSearchMin( int[] arr ) {
	
	int ans = arr[0];

	for (int i = 1 ; i < arr.length ; i++) 
	{
		if (arr[i] < ans)
		{
			ans = arr[i];

		}
	}
	System.out.println("The minimum value is : " + ans);
}
}
