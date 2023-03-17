public class pyra5
{ 
public static void main(String args[])
{
   for(int i=9;i>=1;i--)
   {
      for(int k=2;k<=i;k++)
	  {
	     System.out.print(" ");
	  }
	  for(int j=i;j<=9;j++)
	  {
	     System.out.print(j+" ");
	  }
	  for(int n=8;n>=i;n--)
	  {
	     System.out.print(n+" ");
	  }
	 System.out.println(); 
   }
 }
}