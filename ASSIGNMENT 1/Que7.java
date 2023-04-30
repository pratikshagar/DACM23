class Que7
{
    int sum = 5;
    public int pair(int[] arr)
	{
	int count = 0;
	    for(int i=0;i<arr.length;i++)
		{
		     for(int j= i+1;j<arr.length;j++)
			 {
			      if(arr[i]+arr[j]==sum)
				    count++;
			 }
		 
		 }
		 return count;
	}

  public static void main(String args[])
  {
     int[] arr = {3,2,0,9,4,1,5};
	  Que7 q = new Que7();
	  System.out.println(q.pair(arr));
	 
  }

}