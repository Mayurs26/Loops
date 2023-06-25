import java.util.*;
class Loop6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();
		int s = 1;
		int count = 0;
		
		while(s<=num)
		{
			if(num%s==0)
			{
				
				count++;
			
			}
			
			
				s++;
				
		}
			if(count==2)
			{
				System.out.println("This is prime number");
			}
			else
			{
				System.out.println("This is not prime number");
			}
	}
}