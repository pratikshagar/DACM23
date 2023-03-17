public class pyra7
{
 public static void main(String args[])
 {
    for(int i=9;i>=1;i--)
	{
	  for(int j=9-i;j>1;j--)
	  {
	    System.out.print(" ");
	  }
	  for(int j=1;j<=2*i-1;j++)
	  {
	    System.out.print(i);
	  }
	  System.out.println();
	}
 } 

}