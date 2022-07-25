import java.util.Scanner;

public class DeleteVowel 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s =sc.nextLine();
		String s1 ="";
		s1 = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after Removing vowel :"+s1);
	}

//	public static void main(String[] args)
//	{
//		String c=" ";
//		String vowel="aeiouAEIOU";
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the string");
//		String s= sc.next();
//		for( int i=0;i< s.length();i++)
//		{
//			if( vowel.indexOf(s.charAt(i)) ==-1)
//			{
//				c+=s.charAt(i);
//			}
//		}
//		System.out.println(c);
//	}
	
}
