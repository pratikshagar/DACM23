public class hollow
{
  public static void main(String args[])
  {
     for(int i=1;i<=5;i++)
	 {
	    for(int j=i;j<=5;j++)
		{
		    if(i==1 || j==i || j==5)
			{
			   System.out.print("*");
			}
			else
			{
			  System.out.print(" ");
			}
		}
		System.out.println();
	 }
  
  }
  
}