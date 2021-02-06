package Lists;

import java.util.HashMap;

public class Hashmap {
  public static void main(String[] args) {
    
    HashMap<String ,String >cities = new HashMap<String,String>();

    // Add keys and values (Country, City)
    cities.put("Hyderabad", "Andhrapradesh");
    cities.put("Banglore", "A.P");
    cities.put("KOlkata","A.P");
 
    System.out.println(cities);
  }
}