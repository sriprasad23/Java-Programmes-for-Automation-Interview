package Java_Programms_Interview_Cocepts;

public class _C_ReverseString {

	public static void main(String[] args) {
		
		String str  = "Sriprasad R";
		String rev = "";
		
		/*
		int len = str.length();
		
		for(int i = len -1 ; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
			System.out.println("Reversd string is:  " +rev); */
		
		// Logic 2 using char array
		
		char a[] = str.toCharArray();   // This converts each string into charecter array
		int len = a.length;
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+a[i];
		}
		
		System.out.println("Reversd string is:  " +rev);
		
		// Using String Buffer class
				
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse string using StringBuffer  : " +sb.reverse());
 	}

}
