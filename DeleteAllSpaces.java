
public class DeleteAllSpaces
{
	public static void main(String args [])
	{
		String str ="My Name is Karan  ";
		System.out.println("Original String :"+str+"\n");
	    str = str.replaceAll("\\s", "");
	    
	    System.out.println("After Delete All Spaces : "+ str);
	}

}
