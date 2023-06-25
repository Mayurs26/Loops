import java.util.*;
class Loop5
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
			System.out.println("The total of factors is "+count);
	}
}