class L1
{
	public static void main(String args[])
	{
		int a = 5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(a++ +" ");
				}
			}
		System.out.println();
		a=a-i-1;
		}
	}
}