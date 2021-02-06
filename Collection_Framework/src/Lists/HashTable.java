package Lists;

import java.util.Hashtable;

public class HashTable{ 
    public static void main(String args[]) 
    { 
        
        Hashtable<String, String> cities = new Hashtable<>(); 
  
        
        
        
        cities.put("Hyderabad", "Andhrapradesh");
        cities.put("Banglore", "A.P");
        cities.put("KOlkata","A.P");
        
        
        System.out.println("Mappings of ht1 : " +cities); 
       
    } 
}
