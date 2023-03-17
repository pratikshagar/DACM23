public class starp15
{
   public static void main(String args[])
   {
      for(int i=1;i<=4;i++)
	  {
	     for(int j=1;j<i;j++)
		 {
		   System.out.print("*"); 
           if(j==2)
              System.out.print(" ");			   
		 }
		 System.out.println();
	  }
   
   }
}