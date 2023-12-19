package Java_Programms_Interview_Cocepts;

public class _N_SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		int sum =0;
		
	/*	for(int i=0; i<=a.length-1; i++)    // index 0 1 2 3 4  // a.length -1 
		{
			sum = sum+a[i];
		}*/
		
		// Using Enhanced for loop
		
		for(int sumvalue:a)
		{
			sum = sum+sumvalue;
		}
		
		System.out.println("The Sum of Array : "+sum);
	}
}
