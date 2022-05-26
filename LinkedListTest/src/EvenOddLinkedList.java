import generic.Node;

import java.util.List;
// 1 -> 2 -> 3 -> 4 -> 5 -> 6
public class EvenOddLinkedList {
    public static void main(String[] args) {
        ListNode head = createList();
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oPointer = odd;
        ListNode ePointer = even;
        int i = 1;
        while(head != null){
            if(i % 2 ==0) {
                ePointer.next = head;
                ePointer = head;
            }
            else {
                oPointer.next = head;
                oPointer = head;
            }
            head = head.next;
            i++;
        }
        ePointer.next = null;
        // even.next is to do not consider de -1
        oPointer.next = even.next;
        System.out.println(odd.next);
    }

    private  static ListNode  createList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);


        node1.next =node2;
        node1.next.next = node3;
        node1.next.next.next = node4;
        node1.next.next.next.next = node5;
        node1.next.next.next.next.next = node6;
        return node1;
    }
}

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
