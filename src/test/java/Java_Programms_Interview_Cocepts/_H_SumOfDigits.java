package Java_Programms_Interview_Cocepts;

public class _H_SumOfDigits {

	public static void main(String[] args) {
		
		int num = 123452;
		int sum=0;
		
		while(num>0)
		{
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("The Sum of numbers are : " +sum);
	}
}
