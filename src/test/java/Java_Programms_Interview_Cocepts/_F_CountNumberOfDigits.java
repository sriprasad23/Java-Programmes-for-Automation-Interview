package Java_Programms_Interview_Cocepts;

public class _F_CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num = 12345;
		
		int count =0;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("The Total Number of Digits in Number is : "+count);
	}

}
