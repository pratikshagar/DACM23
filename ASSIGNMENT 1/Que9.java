public class Que9 {  
    public static void main(String[] args) {      
          
        
        int [] arr = new int [] {9,8,7,9,8,6,1,2,1};   
             for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
} 