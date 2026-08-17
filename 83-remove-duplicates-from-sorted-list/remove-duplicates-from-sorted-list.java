class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new LinkedHashSet<>();
        
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for (int ele : set) {
            res.next = new ListNode(ele);
            res = res.next;
        }
        
        return dummy.next;
    }
}