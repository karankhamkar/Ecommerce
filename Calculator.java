import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int a= sc.nextInt();
		System.out.println("Enter num2 : ");
		int b =sc.nextInt();
		System.out.println("Select Operation ");
		System.out.println("Add - a ,Sub -b , Mult - c , Div - d ");
		char ch =sc.next().charAt(0);
		switch(ch)
		{
		case 'a' :
			System.out.println("Addition : "+(a+b));
		break;
		case 'b' :
			System.out.println("Subtraction : "+(a-b));
		break;
		case 'c' :
			System.out.println("Multiplication : "+(a*b));
		break;
		case 'd' :
			System.out.println("Division : "+(a/b));
		break;
		default :
			System.out.println("Invalid input");
			
		}
	}
}
