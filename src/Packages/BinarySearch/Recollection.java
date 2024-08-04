package Packages.BinarySearch;

public class Recollection {
 public static void main(String[] args) {
    //int[]arr = {23,45,67,89,98,98,123,156,178};
    int[]arr = { 100,98,87,74,65,43,33,28,17,10,5};

    int target = 28;
    int ans = binary(arr, target);
    System.out.println(ans);
 }

 static int binary(int[]arr, int target){
    int start = 0;
    int end = arr.length-1;

    boolean isAsc = arr[start]< arr[end];
    
  while(start <= end){
    int mid =  start + (end-start)/2;
    if(arr[mid]== target){
        return mid;
    }

    if(isAsc){
       if(arr[mid]> target){
         end = mid-1;
       }
       else{
        start = mid+1;
       }
    }else{

        if(arr[mid]> target){
            start =mid+1;
        }else{
            end= mid-1;
        }
    }
  }
    


 return -1 ;

 }
}
