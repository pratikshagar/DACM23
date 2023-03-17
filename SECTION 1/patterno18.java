public class patterno18{
public static void main(String args[])
{
	int a=64;
    for(int i=6;i>=1;i--)
	{
	   for(int j=1;j<=i;j++)
	   {
	       System.out.print((char)(a+j)+" ");
	   }

	    System.out.println();
	}
	
}
}