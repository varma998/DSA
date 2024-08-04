package Packages.BinarySearch;

public class OrderAgnosticBS {
   public static void main(String[] args) {
     int[]arr = {-67,-34,-22,11,-10,-3,56,78,98,245};
     int target = 56;
     int ans  = binary(arr, target);
     System.out.println(ans);
    

   }


   static int binary(int[]arr, int target){
    int  start = 0;
    int end =  arr.length-1;
    boolean isAsc = arr[start]< arr[end];

    while(start<= end){
     int mid = start + (end-start)/2;

     if(arr[mid] == target){

        return mid;
     }
     if(isAsc){
        if(arr[mid]> target){
            end =mid-1;
        }else if(arr[mid]< target){
            start =mid+1;
        }

     }
     else{

        if(arr[mid]> target){
            start =mid+1;
        }else if(arr[mid]< target){
            end =mid-1;
        }

     }

    }

    



      return -1;
   }
}
