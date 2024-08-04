package Packages.BinarySearch;

public class CeilingNumber {

    public static void main(String[] args) {
        int[]arr = {2,6,13,18,25,47,68,90,100};
        int target = 67;
        System.out.println(binary(arr, target));
    
      }
      
      static int binary(int[]arr, int target){
        
        int start =0;
        int end = arr.length-1;
    
        
    
        while(start<=end){
         int mid = start + (end-start)/2 ;
    
          if(arr[mid] > target){
             end = mid-1;
        
          }
          else if(arr[mid]< target)
          {
            start =mid+1;
          } else if(arr[mid]==target){
              return mid;
        }
    
    
    
        }
        
    
        return arr[start];
      }
}
