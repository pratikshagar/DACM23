class Que4
{
     public void duplicate(int[] arr)
	 {
	    for(int i =0;i<arr.length;i++)
		{
		    for(int j = i+1; j<arr.length;j++)
			{
			   if(arr[i] == arr[j])
			     System.out.print(" "+arr[j]);
			}
		}
	 }

   public static void main(String args[])
   {
      int[] arr= {8,9,5,8,5,9,3,2};
	  Que4 q =new Que4();
	  q.duplicate(arr);
   
   }
}