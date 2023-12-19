package Java_Programms_Interview_Cocepts;

import java.util.Arrays;

public class _P_ArraysAreEqual {

	public static void main(String[] args) {
	
	// Approach 1	
		int a1[] = {1,2,3,4,5,6,7};
		int a2[] = {1,2,3,4,5,6,7};
		
		/*	boolean status = Arrays.equals(a1, a2);	
		
		if(status == true)
		{
			System.out.println("The Arrays are Equal");
		}
		else 
		{
			System.out.println("The Arrays are Not - Equal");
		}*/
		
// Approach 2
		
		boolean status = true;
		
		if(a1.length == a2.length)
		{
			for(int i=0; i<a1.length; i++)
			{
				if(a1[i] != a2[i])
				{
					status =false;
				}
					
			}
		}
		else
		{
			status = false;
		}
		
		if(status==true)
		{
			System.out.println("The Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are Not-Equal");
		}
	}
}
