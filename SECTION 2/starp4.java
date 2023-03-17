public class starp4{
	public static void main(String argsp[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}