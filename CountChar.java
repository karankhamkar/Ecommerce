import java.util.Scanner;

public class CountChar 
{
	public static void main(String[] args)
	{
		String str;
		int i,total;
		int counter[] =new int[256];
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		str =s.nextLine();
		total =str.length();
		for(i =0;i<total; i++)
		{
			counter[(int)str.charAt(i)]++;
			
		}
		for(i=0;i<256;i++)
		{
			if (counter[i]!=0)
			{
				System.out.println((char)i+" - "+counter[i]);
			}
		}
		
	}

}
