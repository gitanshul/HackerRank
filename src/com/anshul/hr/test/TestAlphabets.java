package com.anshul.hr.test;

public class TestAlphabets {

	public static void main(String[] args) {
		
//		Node root = new Node("K");
//		
//			Node rootLeft = new Node("G");
//				Node rootLeftLeft = new Node("C");
//					Node rootLeftLeftLeft = new Node("B");
//					Node rootLeftLeftRight = new Node("D");
//					rootLeftLeft.left =rootLeftLeftLeft;
//					rootLeftLeft.right = rootLeftLeftRight;
//				rootLeft.left = rootLeftLeft;
//				
//				Node rootLeftRight = new Node("H");
//				rootLeft.right = rootLeftRight;
//		root.left = rootLeft;
//		
//			Node rootRight = new Node("Q");
//				Node rootRightLeft = new Node("M");
//					Node rootRightLeftRgiht = new Node("P");
//					rootRightLeft.right = rootRightLeftRgiht;
//				rootRight.left = rootRightLeft;
//				
//				Node rootRightRight = new Node("Y");
//				rootRight.right = rootRightRight;
//				
//		root.right = rootRight;
//		
//		printInOrder(root);
		
		/* Read from file */
		
	}
	
	private static void printInOrder(Node n){
		if(n.left!=null){
			printInOrder(n.left);
		}
		System.out.println(n.value);
		if(n.right!=null){
			printInOrder(n.right);
		}
	}

	static class Node{
		Node left;
		Node right;
		String value;	
		
		public Node(String value) {
			this.value = value;
		}
	}

}
