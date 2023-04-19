package Samples;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.HashMap;

public class Hashfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hashing with char		
		Map<Character, String> charType
        = new HashMap<Character, String>();

    // Inserting data in the hash map.
    charType.put('J', "Java");
    charType.put('H', "Hibernate");
    charType.put('P', "Python");
    charType.put('A', "Angular");
     
    for (Entry<Character, String> set :
        charType.entrySet()) {

       // Printing all elements of a Map
       System.out.println(set.getKey() + " = "
                          + set.getValue());

//Hashing with integer      
       Map<Integer, String> intType
       = new HashMap<Integer, String>();

   // Inserting data(Key-value pairs) in hash map
   intType.put(1, "First");
   intType.put(2, "Second");
   intType.put(3, "Third");
   intType.put(4, "Fourth");

   // Iterator
   Iterator<Entry<Integer, String> > new_Iterator
       = intType.entrySet().iterator(); 

  
   while (new_Iterator.hasNext()) {
       Map.Entry<Integer, String> new_Map
           = (Map.Entry<Integer, String>)
                 new_Iterator.next();

       // Displaying HashMap
       System.out.println(new_Map.getKey() + " = "
                          + new_Map.getValue());
       
   }
	}

}
}
