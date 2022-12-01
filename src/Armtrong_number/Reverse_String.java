package Armtrong_number;

public class Reverse_String {
	public static void main(String[] args) {
		
		String Org="Akansha";
		String rev="";
		
		for(int i=Org.length()-1;i>=0;i--)
		{
			rev=rev+Org.charAt(i);
		}
		
		System.out.println(rev);
		
		
		if(rev.equals(Org))
		{
			System.out.println("numer is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
	
	}

}
