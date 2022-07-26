package recursion;

class Node
{
    int value;
    Node next, bottom;
    Node(int value)
    {
        this.value = value;
        next = null;
        bottom = null;
    }
}
public class FlatteningLinkedList {
	
 Node flatten(Node root) {
	if(root==null || root.next==null) return root;
	
	root.next = flatten(root.next);
	
	root = mergeTwoLists(root, root.next);
	
	return root;
}

 Node mergeTwoLists(Node a, Node b) {
	Node result = new Node(0);
	Node temp = result;
	
	while(a!=null && b!=null) {
		if(a.value <= b.value) {
			temp.bottom = a;
			temp = temp.bottom;
			a = a.bottom;
		}
		else {
			temp.bottom = b;
			temp = temp.bottom;
			b = b.bottom;
		}
	}
	if(a != null) 
		temp.bottom = a;
	else
		temp.bottom = b;
	return result.bottom;
}
	public static void main(String[] args) {

	}

}
