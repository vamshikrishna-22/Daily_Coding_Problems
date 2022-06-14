package dailyCodingPractice;
import java.util.*;
/**
 * Implement a stack that has the following methods:

push(val), which pushes an element onto the stack
pop(), which pops off and returns the 
topmost element of the stack. If there are
 no elements in the stack, then it should 
 throw an error or return null.
max(), which returns the maximum 
value in the stack currently. If there
 are no elements in the stack, then it 
 should throw an error or return null.
Each method should run in constant time.

 * @author rushvikallampally
 *
 */
public class NewStack {

	public static void main(String[] args) {
		
		MinStack arr = new MinStack();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		System.out.println("max : "+arr.getMax());
		System.out.println("arr.pop()"+ arr.pop());
		System.out.println("max : "+arr.getMax());
		System.out.println("arr.pop()"+ arr.pop());
		System.out.println("max : "+arr.getMax());
		System.out.println("arr.pop()"+ arr.pop());
		System.out.println("max : "+arr.getMax());
		System.out.println("arr.pop()"+ arr.pop());
		System.out.println("max : "+arr.getMax());
		System.out.println("arr.pop()"+ arr.pop());
		

	}
	
	

}

class MinStack {
    class Node{
        int value;
        int max;
        Node next;
        
        Node(int x, int min){
            this.value=x;
            this.max=min;
            next = null;
        }
    }
    Node head;
    public void push(int x) {
        if(null==head){
            head = new Node(x,x);
        }else{
            Node n = new Node(x, Math.max(x,head.max));
            n.next=head;
            head=n;
        }
    }

    public int pop() {
        if(head!=null) {
        	int hed = head.value;
            head =head.next;
            return hed;
        }
        return -1;
    }

    public int top() {
        if(head!=null)
            return head.value;
        return -1;
    }

    public int getMax() {
        if(null!=head)
            return head.max;
        return -1;
    }
}


