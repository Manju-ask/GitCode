package leetcode_arrays;

public class BinarySumTree {
	
	static class Node {
		int data;
		Node left, right;
	}
	static int isLeaf(Node node)
	{
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		return 0;
	}

	static int isSumTree(Node node)
	{
		if(node == null)
			return 0;

		int lsum; // for sum of nodes in left subtree
		int rsum; // for sum of nodes in right subtree


		lsum = isSumTree(node.left);
		if(lsum == -1)		
			return -1;

		rsum = isSumTree(node.right);
		if(rsum == -1)		 // To stop for further traversal of tree if found not sumTree
			return -1;


		if(isLeaf(node)==1 || lsum + rsum == node.data)
			return lsum + rsum + node.data;
		else
			return -1;

	}

	static Node newNode(int data)
	{
		Node node1 = new Node();
		node1.data = data;
		node1.left = null;
		node1.right = null;
		return(node1);
	}

	public static void main(String args[])
	{
		Node root = newNode(26);
		root.left = newNode(10);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(6);
		root.right.right = newNode(3);

		int total = isSumTree(root);
		if(total != -1 && total == 2*(root.data))
			System.out.print("Tree is a Sum Tree");
		else
			System.out.print("Given Tree is not sum Tree");
	}
}

