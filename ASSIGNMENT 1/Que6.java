class Que6
{

   public int oddOccurance(int[] arr)
   {
       
	   for(int i=0;i<arr.length;i++)
	   {
		   int count =0;
	      for(int j =0;j<arr.length;j++)
		  {
		     if(arr[i]==arr[j])
			  count++;
		  }
		  if(count%2==1)
		  {
		     return arr[i];
		  }
	   }
	   return -1;
   }
   public static void main(String args[])
   { 
     int[] arr = {5,5,6,7,7,5,6,3,4,3,4};
	 Que6 q = new Que6();
	 int result = q.oddOccurance(arr);
	  System.out.println("number whose occurance is odd " +result); 
   
   }
}