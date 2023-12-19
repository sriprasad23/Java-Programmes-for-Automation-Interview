package Java_Programms_Interview_Cocepts;

public class _R_MaxAndMinimumInArray {

	public static void main(String[] args) {
		int a[] = {50,30,20,40,60,70,88,89};
		int b[] = {50,30,20,5,40,60,70,88,89,10};
		int max=a[0];
		int min =b[0];

	for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{ 
				max=a[i];
			}
		}
		System.out.println("Maximum number on given Array is:  "+max); 
		
		for(int j=1; j<b.length; j++)
		{
			if(b[j] < min)
			{
				min=b[j];
			}
		}
		System.out.println("Minimum number on gi	yven Array is:  "+min);
	}
}
