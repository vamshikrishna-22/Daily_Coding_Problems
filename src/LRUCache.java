package dailyCodingPractice;

import java.util.*;
/*
 * Implement an LRU (Least Recently Used) cache. 
 * It should be able to be initialized with a cache size n, 
 * and contain the following methods:
set(key, value): sets key to value. 
If there are already n items in the cache and
 we are adding a new item, then it should also
  remove the least recently used item.
get(key): gets the value at key. 
If no such key exists, return null.
 */
public class LRUCache {
   
	
	public static void main(String[] args) {
			
		LRUCache obj = new LRUCache(3);
		System.out.println("obj.put(1,1)");
		obj.put(1,1);
		
		
		System.out.println("obj.put(2,3)");
		obj.put(2,3);
		
		System.out.println("obj.put(3,4)");
		obj.put(3,4);	
		
		System.out.println("obj.get(2)");
		obj.get(2);
		
		
	}

    class Node{
	        int val;
	        int key;
	        Node prev;
	        Node next;
	        Node(int val){
	            this.val=val;
	        }
	    }
	    int size;
	    int cap;
	    Node head;
	    Node tail;
	    HashMap<Integer,Node> hm=new HashMap<>();
	    
	    public void addFirst(Node node){	      
	       if(head==null){
	           head=tail=node;
	       }
	        else {
	            node.next=head;
	            head.prev=node;
	            head=node;
	        }
	        size++;
	    }
	    
	    public void remove(Node node){
	        if(head==null)return;
	        if(head==tail){
	            head=tail=null;
	        }else if(node==head){
	            head=head.next;
	            head.prev=null;
	        }else if(node==tail){
	            Node nm1= tail.prev;
	            nm1.next=null;
	            tail=nm1;
	        
	            
	        }else{
	            Node nm1=node.prev;
	            Node np1=node.next;
	            nm1.next=np1;
	            np1.prev=nm1;
	        }
	        
	        size--;
	    }
	    public LRUCache(int capacity) {             
	          cap=capacity;
	    }
	    
	    public int get(int key) {
	        if(hm.containsKey(key)){
	            Node node=hm.get(key);
	            remove(node);
	            addFirst(node);
	            
	            hm.put(key,head);
	            print(head);
	            return node.val;
	        }
	       
	            return -1;
	    }
	    
	   public static void print(Node head) {
		   while(head != null) {
			   System.out.println("key = "+head.key + " value = "+ head.val);
			   head = head.next;
		   }
	   }
	    
	    public void put(int key, int value) {
	        if(hm.containsKey(key)){
	            Node node=hm.get(key);
	            remove(node);
	            addFirst(node);
	            node.val=value;
	            hm.put(key,node);
	        }else{
	            if(size==cap){
	                hm.remove(tail.key);
	                remove(tail);
	                Node node=new Node(value);
	                node.key=key;
	                addFirst(node);
	                hm.put(key,head);
	            }else{
	                 Node node=new Node(value);
	                node.key=key;
	                addFirst(node);
	                hm.put(key,head);
	            }
	        }
	        print(head);
	    }
	}

