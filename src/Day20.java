import java.util.HashSet;

class ListNode {
    int data;
    ListNode next;
    ListNode(int d)
    {
        data = d;
        next = null;
    }
}

public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(3);
		n1.next = new ListNode(7);
        n1.next.next = new ListNode(8);
        n1.next.next.next = new ListNode(10);
		
		ListNode n2 = new ListNode(99);
		n2.next = new ListNode(1);
        n2.next.next = new ListNode(8);
        n2.next.next.next = new ListNode(10);
		if(MegeNode(n1,n2) != null) {
        System.out.println(MegeNode(n1,n2).data);
		}else {
			System.out.println("null");
		}
        
	}
	
	 public static ListNode MegeNode(ListNode n1, ListNode n2)
	    {
	        
	        HashSet<Integer> hs = new HashSet<Integer>();
	        while (n1 != null) {
	            hs.add(n1.data);
	            n1 = n1.next;
	        }
	        while (n2 != null) {
	            if (hs.contains(n2.data)) {
	                return n2;
	            }
	            n2 = n2.next;
	        }
	        return null;
	    }
}
