import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// 
        //  fun(10,20,30,40,50,60,70,80,90); ===> [10, 20, 30, 40, 50, 60, 70, 80, 90]
		
		fun(); // ==>[]
		
		mult(1,3,5,8,5,6,8,4,5,5);
		fun(12,13,"Hafiz" ,"Shamnad","Haamid"); //function overload test
	}
	
	// <DataType> ...v  ===> Array of Data Types {Variable Length arguments}
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
	static void mult(int a,int b, int ...v) {
		System.out.println(a + " " + b + Arrays.toString(v));
	}
	static void fun(int a,int b, String ...v) {  //variableLengthArgument is always at the end
		System.out.println(a + " " + b + Arrays.toString(v));
	}
}
