//BSClient
import java.rmi.*;
import java.util.*;

public class BSClient {
  public static void main(String args[]) throws Exception {

    int n, arr[], key;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in array : ");
    n = sc.nextInt();
    arr = new int[n];
    System.out.println("Enter array elements : ");
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to be searched : ");
    key = sc.nextInt();
    BSI obj = (BSI)Naming.lookup("rmi://localhost:1099/BS");
          Arrays.sort(arr);
    System.out.print("Elements after sorting : ");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
}
    int result = obj.binarySearch(arr,key);
    if(result<0){
      System.out.println("\nElement is not found");
    }
    else{
      System.out.println("\nElement found at index : " +result);
    }
  }
}