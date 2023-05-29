
public class Main {

    public static void main(String[] args) {
        int[] arr = {183, 123, 9, 76, 98, 1};

        System.out.println(numberfinder(arr));

    }

    static int numberfinder(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (even(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int element) {
        int count = 0;
        while (element > 0) {
            count++;
            element /= 10;
        }
        return count % 2 == 0;
    }
}