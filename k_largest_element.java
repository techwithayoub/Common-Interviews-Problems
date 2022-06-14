import java.io.*;
import java.math.*;
import java.util.*;

class kLargestElement{

  public static int kLargest(int[] arr , int k ){
    int res = -1;
    //that's first brute first methode we sue nlog(n) in complexity
    Arrays.sort(arr);
    res = arr[k];

    return res;
  }

  public static void main(String[] args){
    System.out.println("Bismi Allah");

    int[] arr = new int[] {1,-6,8,12,98,102,3};
    int res = kLargest(arr,3);
    System.out.println("Result : "+res);
  }
}
