class Que3
{

   public void print(int[] arr)
   {
       int n= arr.length;
	   for(int i =0;i<n;i++)
	   {
	      System.out.print(" " +arr[i]);
	   }
	   System.out.println();
   }
   public int secondMax(int[] arr)
   {
      int max = Integer.MIN_VALUE;
	  int secmax = Integer.MIN_VALUE;
	  for(int i=0;i<arr.length;i++)
	  {
	      if(arr[i]>max)
		  {
		     secmax = max;
			 max = arr[i];
		  }
		  else if(arr[i]>secmax && arr[i]!= max)
		  {
		      secmax= arr[i];
		  }
	  }
     return secmax;
   }
   public static void main(String args[])
   {
       int[] arr = new int[]{4,5,7,4,9,8};
	   Que3 q = new Que3();
	   q.print(arr);
	  
       System.out.println("Second Largest Number is :"+q.secondMax(arr));
   }

}