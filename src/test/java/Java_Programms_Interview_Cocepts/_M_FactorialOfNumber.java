package Java_Programms_Interview_Cocepts;

public class _M_FactorialOfNumber {

	public static void main(String[] args) {
	
		int num = 5;
		long factorial = 1;
		
		// Assending order
	/*	for(int i=1; i<=num; i++)  // 5! = 1*2*3*4*5 = 120
		{
			factorial = factorial * i;
		}
		System.out.println("The Factorial of a Number Asscending Order :  " +factorial); */
		
		// Descending Order
		
		for(int i=num; i>=1; i--)  // 5! = 5 * 4*3*2*1 =120
		{
			factorial = factorial * i;
		}
		System.out.println("The Factorial of a Number Descending order :  " +factorial);
	}
}
