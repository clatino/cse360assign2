package cse360assign2;
import java.io.InputStream;
import java.util.Scanner;

public class main 
{
	public static void main(String[] args)
	{
		int number = 0;
		OrderedIntList addto = new OrderedIntList();
	
		while(number != -1)
		{
			Scanner scanner = new Scanner(System.in);
	
			System.out.println( "Enter a number:");
	
			number = scanner.nextInt();
	
			addto.insert(number);
		}
	
		addto.print();
	}
}
