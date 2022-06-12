import java.io.*;
import java.math.*;
import java.util.*;

// problem :
  // Given two strings s1 and s2, check if they're
  // angagrams.
  // two strings areanagrams if they're made of the
  // same characters with the same frequecies

class ValidAnagram{

  public static boolean isAnagram(String s1, String s2){
    boolean valid = true;
    //method 1 , have one string format so sort them and compare
    // char str1[] = s1.toCharArray();
    // char str2[] = s2.toCharArray();
    //
    // Arrays.sort(str1);
    // Arrays.sort(str2);
    //
    // String ts1 = new String(str1);
    // String ts2 = new String(str2);
    //
    // return ts1.equals(ts2);

    //method 2 string traverser
    s1.chars().forEach( c -> {
      char cur = (char) c;
      if(s2.indexOf(cur) == -1)
        {
          //System.out.println("fake");
          return false;
        }
    });

    return valid;
  }
  public static void main(String[] args){

    //System.out.println("Bismi Allah");
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first string : ");
    String s1 = in.next();
    System.out.print("Enter second string : ");
    String s2 = in.next();
    boolean result = isAnagram(s1,s2);
    System.out.println(result);
  }
}
