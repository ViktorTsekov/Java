package uk.ac.reading.gy001040.Week2.Tree;

public class Node {
	int data;
	Node left;
	Node right;
	
	Node(int d) {
		data = d;
		left = null;
		right = null;
	}
	
	public Node insert(Node root, int val) {
		boolean iterate = true;
		Node cur = root;
		Node newNode = new Node(val);
		
		while(iterate) {
			if(cur.data >= val) {
				if(cur.left == null) {
					cur.left = newNode;
					iterate = false;
				} else {
					cur = cur.left;
				}
			} else {
				if(cur.right == null) {
					cur.right = newNode;
					iterate = false;
				} else {
					cur = cur.right;
				}
			}
		}
		
		return root;
	}
	
	
	public void preOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
}
