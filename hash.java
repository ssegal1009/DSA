import java.util.*;
//All about Hash tables
/*
 * A data structure that stores unique keys to values ex. <Integer, String>
 * Each key/value pair is known as an Entry
 * FASTT insertion, look up, and deletion of key/val pairs
 * not ideal for SMALL data sets, great with large data sets
 * 
 * hashing - takes a key and computes an integer (formula will vary based on key and data type)
 * In a Hashtable, we use the hash % capacity to calculate an INDEX number
 *          key.hashCode() % capacity = index
 * 
 * bucket = an indoxed storage location for one or more Entries
 *          can store multiple Entries in the case of a collision (linked similarly a LinkedList) - each entry knows where the next is located
 * 
 * collision = hash function generates the same index for more than one key
 *          less collisions= more effeiciency
 * 
 * Runtime complexity: Best Case: O(1)
 *                     Worst Case: O(n) -> if you place all Entries within the same bucket, it's just one big LinkedList. linear time.
 */

public class hash {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(777);


        for(String key: table.keySet()){//.keySet() takes all the keys and turns them into a set, which is iterable
            System.out.println(key.hashCode() %10 + "\t" + key + "\t" + table.get(key)); //access a value from its key, .get
        }

    }
}
