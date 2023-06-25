import java.util.*;
class Loop2
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");
		char start = sc.next().charAt(0);

		System.out.println("Enter end number");
		char end = sc.next().charAt(0);

		while(start<=end)
		{
			System.out.print(start+" ");
			start++;
		
		}
		

		
	}
}