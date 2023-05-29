import java.util.Scanner;

public class sum {
    public static void main (String[] args){
        int ans= sum3(5,5);
        System.out.println(ans);
//       Sum2();
//       Sum();
    }

    static void Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int num1 =  in.nextInt();
        System.out.println("Enter 2 number :");
        int num2 =  in.nextInt();
        int sum = num1+ num2;
        System.out.println("Sum is : " + sum);


    }
    static int Sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int num1 =  in.nextInt();
        System.out.println("Enter 2 number :");
        int num2 =  in.nextInt();
        int sum = num1+ num2;
        System.out.println("Sum is : " + sum);
        return sum;


    }

    static int sum3(int a , int b){
        int sum  = a + b ;
        return sum ;
    }
}
