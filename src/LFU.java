package dailyCodingPractice;
import java.util.*;

/**
 * Implement an LFU (Least Frequently Used) cache.
 *  It should be able to be initialized with a cache 
 *  size n, and contain the following methods:

set(key, value): sets key to value. If there are
 already n items in the cache and we are adding a 
 new item, then it should also remove the least
  frequently used item. If there is a tie, then 
  the least recently used key should be removed.
get(key): gets the value at key. If no such key exists, 
return null.

 *
 */
class LFU{
	public static void main(String[] args){
		
		LFUCache obj = new LFUCache(3);
		
		 obj.put(1,4);
		 obj.put(2,6);
		 obj.get(2);
		 obj.put(3, 5);
		 System.out.println("1");
		 obj.printlist();
		 obj.put(4,8);
		 obj.get(4);
		 System.out.println("2");
		 obj.printlist();
		 obj.put(5,9);
		 System.out.println("3");
		 obj.printlist();
		 
		 
		 
		 
		 
	}
}
class LFUCache {
    private HashMap<Integer, List<Entry>> listMap; // {freq, list}
    private HashMap<Integer, Entry> keyMap; // {key, Entry}
    
    private int capacity;
    private int size;
    private int min;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.keyMap = new HashMap<>();
        this.listMap = new HashMap<>();
        this.min = 0;
    }
    
    public int get(int key) {
        if(!keyMap.containsKey(key)){
            return -1;
        }
        
        // If present, upgrade it by one 
        Entry keyEntry = keyMap.get(key);
        // Remove from the current list
        listMap.get(keyEntry.count).remove(keyEntry);
        if(keyEntry.count == min && listMap.get(keyEntry.count).size() == 0){
            listMap.remove(keyEntry.count);
            min++;
        }
        
        // Add to the new list 
        if(!listMap.containsKey(keyEntry.count+1)){
            listMap.put(keyEntry.count+1, new ArrayList<>());
        }
        
        listMap.get(keyEntry.count+1).add(keyEntry);
        keyEntry.count += 1;
        
        return keyEntry.val;
    }
    
    public void put(int key, int value) {
        if(this.capacity == 0) return;
         // Check if already present
        if(keyMap.containsKey(key)){
            get(key);
            keyMap.get(key).val = value;
            return;
        }
        
        if(this.size == capacity){
            // Remove the least recently used
            removeLeastFrequentlyUsed();
            this.size--;
        }
        
        // Create new entry and add it in the one freq list
        Entry newEntry = new Entry(key, value, 1);
        keyMap.put(key, newEntry);
        
        if(!listMap.containsKey(1)){
            listMap.put(1, new ArrayList<>());
        }
        
        listMap.get(1).add(newEntry);
        min = 1;
        this.size++;
    }
    
    private void removeLeastFrequentlyUsed(){
        keyMap.remove(listMap.get(min).get(0).key);
        listMap.get(min).remove(0);
        
        if(listMap.get(min).size() == 0) listMap.remove(min);
    }
    
    private class Entry{
        public int key;
        public int val;
        public int count;
        
        public Entry(int key, int value, int count){
            this.key = key;
            this.val = value;
            this.count = count;
        }
    }
    public void printlist() {
    	for(int i : listMap.keySet()) {
    		for(Entry j : listMap.get(i)){
    			System.out.println("Key : "+j.key + " value : "+ j.val + " count : "+j.count);
    		}
    	}
    }
}
