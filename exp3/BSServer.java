//BSServer
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class BSServer extends UnicastRemoteObject implements BSI {
  public BSServer() throws Exception {
      //CONSTRUCTOR
      super(); 
    }
  public int binarySearch(int arr[],int key) throws RemoteException
  { 
    int res = Arrays.binarySearch(arr,key);
    return res;
  }
  public static void main(String args[]) throws Exception {
    BSServer obj = new BSServer();
    System.out.println("Server is getting started.....");
    Naming.rebind("BS",obj);
  }
}