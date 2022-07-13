package leetcode_arrays;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prevSlow=slow;
        if(head==null) return false;
        if(head.next==null) return true;
        while(fast!=null && fast.next != null){
            prevSlow=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast == null){
            prevSlow.next=null;
        }
        
        ListNode prev=null;
        ListNode cur=slow;
        ListNode next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode head2= prev;
        ListNode temp1=head;
        ListNode temp2=head2;
    
        while(temp1!=null && temp2!=null){
            if(head.val != head2.val)
                return false;
            temp1= temp1.next;
            temp2= temp2.next;
        }
        
        return true;
    }
	public static void main(String[] args) {

	}

}
