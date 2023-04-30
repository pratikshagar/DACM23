class Que1{
     
	 public  static int missingValue(int[] arr)
	{
	   int n = arr.length +1;
	   int sum = n* (n+1)/2;
       
      for(int num : arr)  
      {
          sum = sum - num;
		  
 	  }	  
	  return sum;
	 
	}
	
	public static void main(String args[])
	{
	int[] arr = {3,5,4,2};
	    System.out.println(missingValue(arr));
	}
}