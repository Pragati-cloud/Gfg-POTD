import util.java.*;

public class Main7 {
     public static void main(String[] args){
         int[] arr = {-34 , -18, -6, 4,6,23,89,100};
         int target;
         int n = arr.length;
         int ans = bs(arr, -18);
         int ans2 = ceiling(arr, 0, n-1, 24);
         System.out.println(ans);
         System.out.println(ans2);
     }
     public static int bs(int[] arr, int target ){
        int start=0;
        int end = arr.length -1;

        while(start <=end){
            int mid = start +(end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }return -1;
     }
     static int ceiling(int arr[], int low, int high, int x)
    {
      int mid ;    
       
      if(x <= arr[low])
        return low; 
     
      if(x > arr[high])
        return -1;  
      
      mid = (low + high)/2; 
      
      if(arr[mid] == x)
        return mid;
       
      else if(arr[mid] < x)
      {
        if(mid + 1 <= high && x <= arr[mid+1])
          return mid + 1;
        else
          return ceiling(arr, mid+1, high, x);
      }
        
      else
      {
        if(mid - 1 >= low && x > arr[mid-1])
          return mid;
        else   
          return ceiling(arr, low, mid - 1, x);
      }
    }
    
}
