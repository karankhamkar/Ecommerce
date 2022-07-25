import java.util.Scanner;

public class FindLargestNum
{
	public static void main(String[] args)
	{
		int n1 ,n2 ,n3;
		System.out.println("Enter Three Numbers : ");
		Scanner sc =new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if(n1>n2 && n1>n3)
			System.out.println("The Largest Num is : "+n1);
		else if(n2>n1 && n2>n3)
			System.out.println("The Largest Num is : "+n2);
		else if(n3> n1 && n3>n2)
			System.out.println("The Largest Num is : "+n3);
		else
			System.out.println("There are Two or Three are Same..");
	}
	
}
