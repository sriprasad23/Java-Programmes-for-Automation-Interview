package Java_Programms_Interview_Cocepts;

public class _T_SearchingElementInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,30};
		int search_Element = 20;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]); 
			if(search_Element == a[i])
			{
				System.out.println("Element Found in index : "+i +" search element is : "+ a[i]);
				flag=true;
				break;
			}
		}
		if (flag==false)
		System.out.println("Element Not Found  : ");
	}

}
