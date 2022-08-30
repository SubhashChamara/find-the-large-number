import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		int number1 = input.nextInt();
		
		System.out.print("Enter Second Number:");
		int number2 = input.nextInt();
		
		System.out.print("Enter Third Number:");
		int number3 = input.nextInt();
		
		if (number1 > number2)
		{
			if (number1 > number3)
			{
				System.out.println("Maximum Number :" + number1);
			}
			else
			{
				System.out.println("Maximum Number :" + number3);
			}
		}			
		else if (number2 > number3)
		{
			System.out.println("Maximum Number :" + number2);
			
		}	
		
		else 
		{
			System.out.println("Maximum Number :" + number3);
		}
		
		
		
		
	}
}