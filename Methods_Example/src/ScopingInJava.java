
public class ScopingInJava {

	public static void main(String[] args) {
		
	
//Scoping is that changes are only be valid in appropriate functions 

		int a = 18 ;
		int b = 27 ; 
		
		System.out.println("1 a = " + a);
		System.out.println("1 b = " + b);
		
//		a = 22 ; ==> reassign another value
		
		
		{
			
//			int a = 5 ;  ==> cannot use parent variable name 
//			int b = 3 ;		==> for further details shadowing java will help
			
			int c = 3 ; 
			System.out.println("1.1 c = " + c);
			forloop(c);
			
		}
		
//		int c = 5 ;  ==> possible but not a good practice
//		System.out.println("1.2 c = " + c);
		
//		System.out.println("1.1 c = " + c);  ==> throw error cauz its in a block
//		which is called block scoping. Values initialized in this block will remain in block

		random();
		
	}
	
// same variable name can be used for storing different values
// unless it is in a different class
		
	static void random() {
		
			int a = 12 ; 
			int b = 14 ;
			System.out.println("2 a = " + a);
			System.out.println("2 b = " + b);
			
		}
		
	//Scoping in for-loops

	static void forloop(int c) {
		for (int i = 0 ; i<=c ; i++) {
			int a = 26; 
			System.out.println(a);
		}
	}
	
	// anything initialized outside the block can use inside the block.
    //	 anything initialized inside the block cannot use outside the block.
	
}





