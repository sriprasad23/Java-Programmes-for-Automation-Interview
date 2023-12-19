package Java_Programms_Interview_Cocepts;

import java.util.Scanner;

public class _I_LargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterd First Number: ");
		int a=sc.nextInt();
		
		System.out.println("Enterd Second Number: ");
		int b=sc.nextInt();
		
		System.out.println("Enterd Third Number: ");
		int c=sc.nextInt();
		
		// Logic 1
		if(a>b && a>c)
		{
			System.out.println("The largest number is A: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The largest number is B: "+b);
		}
		else
		{
			System.out.println("The largest number is C: "+c);
		}
		
		// Logic 2 using Ternary operator
		
		int largest = c> (a>b?a:b) ? c:(a>b?a:b);
		
		System.out.println(largest+ " :  Largest number is");
	}
}
