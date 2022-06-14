import java.io.*;
import java.math.*;
import java.util.*;

// problem : find first and last position
// of an x number in sorted array and return 
// [first , last] otherways return [-1,-1]

class FirstLast{
  //let's start first we will search for the first index using binary search tree
  //and we will add condition to find the first element
  static int binaryFirstSearch(int arr[], int l, int r, int x){
     if (r >= l) {
         int mid = l + (r - l) / 2;
         //System.out.println("mid : "+mid);

         if (arr[mid] == x && arr[mid-1] != x)
             return mid;

         if (arr[mid] < x)
              return binaryFirstSearch(arr, mid + 1, r, x);

         return binaryFirstSearch(arr, l, mid - 1, x);

     }

     return -1;
   }

  public static int[] firstLast (int[] arr,int num){
    int first = -1;
    int last = -1;

    first = binaryFirstSearch(arr,0,arr.length -1 , num);
    //System.out.println("first : "+first);

    //find number of occurences to get last

    // If element is not present
    if (first == -1)
        last = -1;


    // Count elements on right side.
    last = first;
    int right = first + 1;
    while (right < arr.length  && arr[right] == num)
        {
          last++;
          right++;
        }


    System.out.println("Positions are : ("+first+","+last+")");



    return new int[] {first, last};
  }


  public static void main(String[] args){
    int[] arr = new int[] {-1,2,3,3,5,7,7,7,16,22};
    firstLast(arr,7);
  }
}
