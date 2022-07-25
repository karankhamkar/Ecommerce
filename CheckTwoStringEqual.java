import java.util.Scanner;

public class CheckTwoStringEqual 
{
	public static void main(String[] args)
	{
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st String : ");
		
		str1 = sc.nextLine();
		
		System.out.println("enter 2nd String : ");
		str2 = sc.nextLine();
		
		if(str1.contentEquals(str2))
			System.out.println("Input String Is Equal.");
		else
			System.out.println("Input String Is Not Equal.");
	}

}
