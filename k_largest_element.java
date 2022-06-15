import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

// problem : given an array of integers arr
// and integer k , find the kth largest
// element

class kLargestElement{

  public static int kLargest(int[] arr , int k ){
    int res = -1;
    //that's first brute first methode we sue nlog(n) in complexity
    // Arrays.sort(arr);
    // res = arr[k];

    //other solution is to find maximum and remove it in each itteration
      List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
      for (int i=0;i<k ;k++ ) {
      try{
        int max =(int)Collections.max(list);
      }catch(Exception ex){
        System.out.println(ex.stack());
      }
      list.remove(Integer.valueOf(max));
    }

    res = Collections.max(list);

    return res;
  }

  public static void main(String[] args){
    System.out.println("Bismi Allah");

    int[] arr = new int[] {1,-6,8,12,98,102,3};
    int res = kLargest(arr,3);
    System.out.println("Result : "+res);
  }
}
