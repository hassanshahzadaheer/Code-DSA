import java.util.HashMap;

public class HashMapsExample1 {

    public static void main(String args[]) {

        // simple hashmap
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("KHI", 3);
        System.out.println("Initial size of the Map is : " + hashMap.size());

        // hashmap with size and load factor
        HashMap<String, Integer> hashMapWithSize = new HashMap<String, Integer>(5, 0.5f);
        for (int i = 0; i <= 9; ++i) {
            System.out.println("Putting key: " + i);
            hashMapWithSize.put("Index " + i, i);
        }
        System.out.println("Hash Map With Size is " + hashMapWithSize.size());

        // copy hash map from other map

        HashMap<String,Integer> copyHashMap = new HashMap<String, Integer>(hashMapWithSize);
        System.out.println(copyHashMap);

    }

}
