class Que5
{
   public void print(int[] arr)
   {
      for(int i=0;i<arr.length;i++)
	  {
	    System.out.print(" " +arr[i]);
		
	  }
	  System.out.println();
   }
   public int min(int[] arr)
   {
	   int min = arr[0];
	   for(int i = 1;i<arr.length;i++)
	   {
		   if(arr[i]<min)
		       min = arr[i];
	   }
	   return min;
   }
     public int max(int[] arr)
   {
	   int max = arr[0];
	   for(int i = 1;i<arr.length;i++)
	   {
		   if(arr[i]>max)
		       max = arr[i];
	   }
	   return max;
   }

  public static void main(String args[])
  {
    Que5 q = new Que5();
	int[] arr = {4,5,3,5,3,2,0};
	q.print(arr);
	System.out.println("MINIMUM ELEMENT IS :"+q.min(arr));
	System.out.println("MAXIMUM ELEMENT IS :"+q.max(arr));
	q.max(arr);
  
  }
}