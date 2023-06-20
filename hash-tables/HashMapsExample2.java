// How do you add key-value pairs to HashMap?
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapsExample2 {

    public static void main(String args[]) {

        // simple hashmap
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        // how to store values in hash table
        hashMap.put("KHI", 1);
        hashMap.put("LH", 2);
        hashMap.put("ISL", 3);

        // how to get values from hashtable
        System.out.println(hashMap.get("KHI"));

        //  to get key and values as pair we can use set
        // Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();

        // for (Map.Entry<String,Integer> entry : entrySet) {

        //     String key = entry.getKey();
        //     Integer value = entry.getValue();

        //     System.out.println("Key: " + key + ", Value: " + value);
        // }
        // get key and value pair using simple way
        for (String keys : hashMap.keySet()) {
            Integer value = hashMap.get(keys);
            System.out.println("Key: " + keys + " Value: " + value );
        }

        HashMap<String, Integer> countries = new HashMap<String,Integer>();

        countries.put("PK", 1);
        countries.put("IN",2);
        countries.put("US",3);
        countries.put("CA",4);

        countries.putAll(hashMap);

        for(String keys: countries.keySet()) {
            Integer value = countries.get(keys);
            System.out.println("Key: " + keys + " Value: " + value );
        }


    }

}
