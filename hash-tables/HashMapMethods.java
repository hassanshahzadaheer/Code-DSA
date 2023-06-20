import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // put(K, V) Adds something (like a fruits) to a box with a label (key) so you can find it later.
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("orange", 8);
        // System.out.println("HashMap after put(): " + hashMap);

        // // putAll() Adds everything from one box to another box.
        HashMap<String, Integer> otherMap = new HashMap<>();
        otherMap.put("kiwi", 3);
        otherMap.put("grape", 7);
        hashMap.putAll(otherMap);
        System.out.println("HashMap after putAll(): " + hashMap);

        // // putIfAbsent(K, V) Adds something to a box only if it's not already there.
        hashMap.putIfAbsent("orange", 20); // Won't replace existing value
        hashMap.putIfAbsent("mango", 15); // New entry
        System.out.println("HashMap after putIfAbsent(): " + hashMap);

        // // get(K) - Gets something (like a toy) from the box by looking at its label (key).
        Integer value1 = hashMap.get("banana");
        Integer value2 = hashMap.get("orange");
        System.out.println("Value of 'banana': " + value1);
        System.out.println("Value of 'orange': " + value2);

        // // getOrDefault(K, defaultValue)  Gets something from the box by looking at its label, or gives you a default item if the box is empty.
        Integer value3 = hashMap.getOrDefault("orange", 0);
        Integer value4 = hashMap.getOrDefault("kiwi", 0);
        System.out.println("Value of 'orage': " + value3);
        System.out.println("Value of 'kiwi': " + value4);

        // // containsKey(K) - Checks if the box has a label (key) you're looking for.
        boolean containsKey = hashMap.containsKey("apple");
        System.out.println("Contains 'apple': " + containsKey);

        // // containsValue(V) Checks if the box has a specific item (value) inside.
        boolean containsValue = hashMap.containsValue(7);
        System.out.println("Contains value '7': " + containsValue);

        // // replace(K, V) Changes the item (value) in the box with a new one using its label (key).
        hashMap.replace("orange", 15);
        System.out.println("HashMap after replace(): " + hashMap);

        // // replace(K, oldValue, newValue) -  Changes the item in the box only if it matches a specific old item, using its label (key).
        hashMap.replace("apple", 10, 20);
        System.out.println("HashMap after replace(): " + hashMap);

        // // remove(K) Takes out something from the box by looking at its label (key).
        hashMap.remove("banana");
        System.out.println("HashMap after remove(): " + hashMap);

        // // remove(K, V) - Takes out something from the box only if it matches a specific item, using its label and item together.
        hashMap.remove("orange", 15);
        System.out.println("HashMap after remove(): " + hashMap);

        // // keySet()
        System.out.println("Keys in the HashMap: " + hashMap.keySet());

        // // values()
        System.out.println("Values in the HashMap: " + hashMap.values());

        // // entrySet()
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
