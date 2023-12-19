package Java_Programms_Interview_Cocepts;

public class _S_DuplicateElementsinArray {

	public static void main(String[] args) {
		
		String arr[] =  {"Java", "C", "C#","Python", "Java","C#"};
		
		// Approach 1
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Found duplicate Elements  :"  +arr[i]);
					flag = true;
				}
			}
		}
		if(flag == false)
		{
			System.out.println("Duplicate Elements Not found");
		}
			
	}

}
