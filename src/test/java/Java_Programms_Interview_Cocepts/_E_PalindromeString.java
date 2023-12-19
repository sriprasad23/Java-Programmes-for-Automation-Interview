package Java_Programms_Interview_Cocepts;

public class _E_PalindromeString {

	public static void main(String[] args) {
	
		String str  = "madams";
		String org_str = str;
		String rev = "";
		
		int len = str.length();
		
		for(int i = len -1 ; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
				
			if(org_str.equals(rev) )
			{
				System.out.println("The Enterd String is Palindrome : " +org_str);
			}
			else
			{
				System.out.println("The Enterd String is Not -Palindrome : " +org_str);
			}
	}

}
