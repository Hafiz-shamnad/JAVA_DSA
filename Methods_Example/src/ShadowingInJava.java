
public class ShadowingInJava {
	
	static int x = 20 ; //  {shadowed at line 18}
	
	//initialized in global so available in every block of code 
	
	public static void main(String args[]) {
		
		//global variable x available in every block of code 
		
		System.out.println(x); // ===> 20
		
		//SHADOWING == LOWER LEVEL IS SHADOWED BY UPPER LEVEL
		
		//x = 25 , shadow x = 20 {updates from 20 to 25}
		
		int x = 25; 
		System.out.println(x); // ===> 25
		
		//SHADOWING == LOWER LEVEL IS SHADOWED BY UPPER LEVEL
		
		fun(); // ===> 20
		
	}
	static void fun( ) {
		System.out.println(x); //global variable x available in every block of code including functions
	}
}


//int x ==> Declaring
//int x = 30 ==> Initializing


