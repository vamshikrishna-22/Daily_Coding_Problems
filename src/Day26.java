import java.util.*;
class listNode {
    int val;
    listNode next;
    listNode() {}
    listNode(int val) { this.val = val; }
    listNode(int val, listNode next) { this.val = val; this.next = next; }
}
public class Day26 {
    static int node = 0;
    static listNode newHead = null;

    public static listNode removeNthFromEnd(listNode head, int n) {
        solve(null, head, n, 1);
        return newHead;
    }

    public static void solve(listNode prev, listNode head, int n, int i) {
        if (head == null) {
            node = i - 1 - n + 1;
            return;
        }
        solve(head, head.next, n, i + 1);
        newHead = head;
        if (i == node) {
            if (prev == null) {
                newHead = head.next;
            } else {
                prev.next = head.next;
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        listNode linkedlist = new listNode(1);
        linkedlist.next = new listNode(2);
        linkedlist.next.next = new listNode(3);
        linkedlist.next.next.next = new listNode(4);
        linkedlist.next.next.next.next = new listNode(5);
        listNode res = removeNthFromEnd(linkedlist,n);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
