package uk.ac.reading.gy001040.Week2.Tree;

public class Tree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(4);
		
		root = root.insert(root, 2);
		root = root.insert(root, 7);
		root = root.insert(root, 1);
		root = root.insert(root, 3);
		root = root.insert(root, 6);
		
		root.preOrder(root);
	}

}
