package Java_Programms_Interview_Cocepts;

	public class _O_EvenOddFromArray {

	public static void main(String[] args) {
	
	int a[] = {1,2,3,4,5,6,7,8};
		
			System.out.println("The Number is Even in the Array.....");
		/*	for(int i=0; i<a.length; i++)
			{
				if(a[i]%2==0)
				{
					
					System.out.println(a[i]);
				}
			}*/
			
			// Enhanced for loop
			
			for(int value : a)
			{
				if(value%2 == 0)
				{
					System.out.println(value);
				}
			}
			
			System.out.println("The Number is Odd in the Array.....");
		/*	for(int i=0; i<a.length; i++)
			{
				if(a[i]%2!=0)
				{
					System.out.println(a[i]);
				}
			}*/
			
			// Enhanced for loop
			
			for(int value : a)
			{
				if(value%2 !=0)
				{
					System.out.println(value);
				}
			}
	}
}
