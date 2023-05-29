public class swap {
    public static void main(String[] args) {
        System.out.println("Before Swap");
        System.out.println("a = 30 b = 20 ");
        Swap(30 , 20);
    }

    static void Swap(int a , int b){
        int temp = a ;
        a = b;
        b = temp;
        System.out.println("After Swap");
        System.out.println("a = " + a + " " + "b = " + b);
    }
}
