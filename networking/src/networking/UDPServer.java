package networking;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.*;
public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(10);
			byte[] elementBytes = new byte[100]; 
			DatagramPacket in = new DatagramPacket(elementBytes,elementBytes.length);
			ds.receive(in);
			String ele = new String(elementBytes).trim();
			System.out.println("Data received from client:"+ele);
			String array[] = ele.split(" ");
			
			int[] elements = new int[array.length];
			for(int i = 0;i<elements.length;i++) {
				elements[i] = Integer.parseInt(array[i]);
			}
			
			Arrays.sort(elements);  //SORTING OF ELEMENTS
			String str="";
			for(int i = 0;i<elements.length;i++) {
				str += Integer.toString(elements[i])+" ";
			}
			str = str.trim();
			byte result[] = str.getBytes();
			DatagramPacket out= new DatagramPacket(result,result.length,in.getAddress(),in.getPort());
			ds.send(out);
			ds.close();		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}