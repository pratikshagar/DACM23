class Que2
{
   static void sort(int[] arr)
   {
    int n=6;
      for (int i = 0; i < arr.length; i++)   
      {  
           for (int j = i + 1; j < arr.length; j++)   
           {  
              int tmp = 0;  
              if (arr[i] > arr[j])   
                 {  
                  tmp = arr[i];  
                  arr[i] = arr[j];  
                   arr[j] = tmp;  
                  }  
            }
			      
           if(arr[i] == n)
		   {
			   System.out.println("Number found :"+arr[i]);
		   }
       }
	   for(int i=0;i<arr.length;i++)
	   {
		     System.out.println(arr[i]);
	   }
   }  
   public static void main(String args[])
   {
      int arr[]={7,6,4,5,2,1};
	  sort(arr);
   }
}