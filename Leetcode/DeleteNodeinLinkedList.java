package leetcode_arrays;


class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
	}
}
public class DeleteNodeinLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode temp = node.next;
        node.next = node.next.next;
        temp = null;
    }
	public static void main(String[] args) {

	}

}
