package dailyCodingPractice;
/*
 * This problem was asked by Google.
   head -> a -> b -> c -> null
Given the head of a singly linked list, 
reverse it in-place.
 */

class NodeList{
	int val;
	NodeList next;
	public NodeList(int data) {
		this.val = data;
		
	}
	
}

public class LLreverse {

	public static void main(String[] args) {
		
		NodeList head = new NodeList(1);
		head.next = new NodeList(2);
		head.next.next = new NodeList(3);
		head.next.next.next = new NodeList(4);
		System.out.println("Before");
		printLL(head);
		System.out.println();
		System.out.println("After");
		head= reverseList(head);
		
		printLL(head);

	}
	
	public static NodeList reverseList(NodeList head) {
		
        if(head == null)
            return head;
        if(head.next == null)
            return head;
        
        NodeList pre = null ;
        NodeList cur = head ;
        NodeList net = head.next ;
        
        while(cur.next != null){
            cur.next =pre;
            pre = cur;
            cur=net;
            net = net.next;
        }
        
        cur.next =pre;           
        
        return cur;        
    }
	
	public static void printLL(NodeList head){
		while(head != null) {
			System.out.print(head.val + " -> " );
			head = head.next;
		}
		System.out.print("null");
	}	
	

}
