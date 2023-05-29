
public class Function_OverLoading {

	public static void main(String[] args) {
		
		// Two or more fun have same name but different argument 
		// Happens at RunTime
		
		fun(25);
		fun("Hafiz Shamnad");
		sum(5,2,2,4); 

		//sum(5,2,2,4,6);  ===>> Throws error
		
		// sum(5,2,2) {at ln 29}; sum(5,2) {at ln 26};  ====>> Still works
	}
	
	static void fun(int a ) {
		System.out.println(a);
	}
	
    static void fun(String name) {
    	System.out.println(name);
	}
    
    static void sum(int a , int b) {
    	System.out.println(a + b);
    }
    static void sum(int a , int b, int c) {
    	System.out.println(a + b + c);
    }
    static void sum(int a , int b, int c ,int d) {
    	System.out.println(a + b + c + d);
    }


}
