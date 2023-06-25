import java.util.*;
class Loop4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();
		int s = 1;
		int count = 0;
		System.out.println("These are the Factors : ");
		while(s<=num)
		{
			if(num%s==0)
			{
				System.out.println(s);
				//count++;
			}
				s++;
				
		}
			System.out.println("The total of factors is "+count);
	}
}