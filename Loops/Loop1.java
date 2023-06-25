import java.util.*;
class Loop1
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");
		int start = sc.nextInt();

		System.out.println("Enter end number");
		int end = sc.nextInt();

		while(start<=end)
		{
		if(start>=1)
		{
			System.out.println(start);
		}
			start++;
		
		}
		

		
	}
}