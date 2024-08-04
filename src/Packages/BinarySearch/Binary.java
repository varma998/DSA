package Packages.BinarySearch;

public class Binary {
 public static void main(String[] args) {
    int[] arr = {1,5,8,9,23,56,78,97,103};
    int target = 56;

    int ans  = binarySearch(arr, target);
    System.out.println(ans);


 }

 static int binarySearch(int[]arr, int target){
  int start =0;
  int end = arr.length-1;

  while (start<= end){
    int mid =  start+  (end-start)/2;

    if(arr[mid]> target){
        end= mid-1;
    } else if(arr[mid]< target){
          start = mid+1;
    }else{
        return mid;
    }

  }



 return -1;
 }
  
}
