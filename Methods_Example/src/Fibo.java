import java.util.Scanner;

public class Fibo {
	public static void main (String args[]) {
		int p = 0 , i = 1 , n = 0, count , temp ;
		Scanner in = new Scanner (System.in);
		n = in.nextInt();
		count = 2;
		while (count <= n) {
			temp = p;
			p += i;
			i = temp;
			count++;
		}
		System.out.println(p);
	}
}
