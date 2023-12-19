package Java_Programms_Interview_Cocepts;

public class _G_CountEvenAndOddNos {

	public static void main(String[] args) {
		
		int num = 123456789;
		
		int even_num = 0;
		int odd_num = 0;

		while(num>0)
		{
			int rem = num%10;
			if(rem%2 == 0)
			{
				even_num++;		
			}
			else
			{
				odd_num++;
			}
			
				num=num/10;
		}
		
		System.out.println("The Even numbers are : " +even_num);
		System.out.println("The Odd numbers are : " +odd_num);
	}

}
