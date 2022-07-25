import java.util.Scanner;

public class CountWord
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str;
		
		System.out.print("enter string: ");
		str =sc.nextLine();
		
		String word[] = str.split("\\s+"); //split the string into words.
		
		System.out.println("Saamba Kitane Words hain: "+" "  +word.length);
		
	}

//	public static void main(String[] args)
//	{
//		Scanner sc =new Scanner(System.in);
//		String str;
//		int c=0;
//		
//		System.out.println("enter String  :");
//	    str = sc.nextLine();
//	    
//	    for(int i=0;i<str.length();i++)
//	    {
//	    	if(str.charAt(i)==' ')
//	    		c++;
//	    }
//	    c+=1;
//	    System.out.println("Num. of words: "  +c);
//	}
}
