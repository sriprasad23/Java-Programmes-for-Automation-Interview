package Java_Programms_Interview_Cocepts;

public class _A_Swapping_Of_2Numbers {

	public static void main(String[] args) {
		
		int a= 10, b=20;
		
		System.out.println("Before Swapping the numbers are:  " +a+ "  "+b);
		
		// Logic 1 using 3rd variable
		
					/*	int t = a;
		
						a=b;
						b=t;   */
		
		
		// Logic 2 using + and - without using 3rd variable    
		
				/*	a=a+b;   // 10+20 = 30
					b=a-b;	// 30-20 =  10
					a=a-b;   // 30 - 10 =20   */
		
		
		// Logic 3 using * and /  here a and b should not be 0
		
		 			/*	a= a*b; // 10*20 = 200
		 				b=a/b;	// 200/20 = 10
		 				a=a/b;	// 200/10 = 20   */
		
		
		// Logic 4 using bitwise operator (^)
		
						a=a^b;
						b=a^b;
						a=a^b;    
		 
		// Logic 5 - single statment  [Execution allways starts from rite to left]
		
		// a= 10, b= 20 [a=b(a=20)   b=a+b (20=10+20 = 300) ]
					
		//			b=a+b-(a=b);
		
		System.out.println("After Swapping the numbers are:  " +a+ "  "+b);

	}

}
