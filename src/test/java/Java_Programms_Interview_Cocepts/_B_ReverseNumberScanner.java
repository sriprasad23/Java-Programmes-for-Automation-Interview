package Java_Programms_Interview_Cocepts;

import java.util.Scanner;

public class _B_ReverseNumberScanner {

	public static void main(String[] args) {
		
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter the Input Number: ");
		
		int num = sc.nextInt();  //Ex: 12345 54321  // This method will accept value from user and store that no inside the num varable
		
		// Using algorithm 1
		
	/*	int rev = 0;
		while(num!=0)
		{
			rev=rev*10 + num%10; // (0*10 = 0 + 1234%10 = 4) 0+4=4, 40 + 3 = 43, 430+ 2 =432, 4320+1 =4321.
			num = num/10; //1234/10 = 123 , 123/10 = 12 ,  12/10 = 123, 1/10 = 0
		} */
		
		
		// Logic 2 using String Buffer class method
		
   /*		
		 		
		StringBuffer sbf = new StringBuffer(String.valueOf(num));  // creat object and convert String.valueof will convert string into number format
		
		StringBuffer rev = sbf.reverse();  // reverse the number    */
		
		
	  // Logic 3 using String Builder Class
		
		StringBuilder sbd =  new StringBuilder();
		sbd.append(num);
		StringBuilder rev = sbd.reverse(); 
		
	/*	StringBuffer sbf = new StringBuffer();
		sbf.append(num);
		StringBuffer rev = sbf.reverse(); */
		
		
		System.out.println("After revesing the number value: " +rev);
		
	}

}
