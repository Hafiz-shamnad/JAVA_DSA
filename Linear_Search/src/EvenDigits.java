
public class EvenDigits {

	public static void main(String[] args) {
		int[] arr = {18 , 12, 9 , 76 , 98 , 1};
		System.out.println(check(arr));
	}
	static int check(int[] arr) {
		int count = 0 ;
		while (int num:arr ){
			arr[num] > 0;
			arr[num] /= 10;
		}
	}
}
