import java.rmi.*;
 public interface BSI extends Remote 
 {

 	public int binarySearch(int arr[],int key) throws RemoteException;
 }