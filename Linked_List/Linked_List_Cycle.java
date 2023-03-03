package Linked_List;

import java.util.HashSet;

public class Linked_List_Cycle {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();

        while (head != null) {
            if (!visited.contains(head)) {
                visited.add(head);
                head = head.next;
            } else {
                return true;
            }

        }

        return false;
    }
}
