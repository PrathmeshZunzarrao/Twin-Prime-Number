
import java.util.Scanner;
class TwinPrimeno
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();

		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		

		if(checkPrime(num1) && checkPrime(num2) && checkGap(num1,num2) )
		{
			System.out.println("Twin Prime Pair");
		}
		else
		{
			System.out.println("Not Twin Prime Pair");
		}
	}

	public static boolean checkPrime(int ip)
	{
		if(ip==1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<ip;i++)
			{
				if(ip % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}

	public static boolean checkGap(int a, int b)
	{
		if((a - b) == 2)
		{
			return true;
		}
		return false;
	}


}
