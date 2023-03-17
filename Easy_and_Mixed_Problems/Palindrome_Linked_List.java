package Easy_and_Mixed_Problems;

public class Palindrome_Linked_List {

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

    public boolean isPalindrome(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n += 1;
            temp = temp.next;
        }

        int[] nums = new int[n];
        int i = 0;
        while (head != null) {
            nums[i] = head.val;
            head = head.next;
            i++;
        }

        for (int l = 0, r = nums.length - 1; l <= r; l++, r--) {
            if (nums[l] != nums[r]) {
                return false;
            }
        }
        return true;
    }
}
