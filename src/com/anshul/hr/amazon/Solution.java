package com.anshul.hr.amazon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution {
	public static void main(String[] args) throws Exception {
				
		List<String> origInput = new ArrayList<String>();		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
		try{
			while((line = bf.readLine())!=null){
				origInput.add(line.replaceAll(" " , "").toUpperCase());
				if(line.trim().length() == 0) 
					break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		/* Reverse the list to bring the root node to front of the list 
		 * (K), (GQ), (CM), (BDHPY) */
		Collections.reverse(origInput);
		
		/* Create single line of chars from the original sequence 
		 * (all levels collapsed to a single line) i.e. KGQCMBDHPY */		 
		StringBuffer sb = new StringBuffer();
		for(String s : origInput){
			sb.append(s); 
		}
	
		/* Convert the Char sequence to a char array */
		char[] array = sb.toString().toCharArray();
		
		/* Create the root node with the first alphabet in the reversed list (i.e. K) */
		Node bTree = new Node(String.valueOf(array[0]));
		/* Recreate the binary tree using the leaves */
		for(int i=1; i < array.length; i++){
			insertNodeInTree(bTree, new Node(String.valueOf(array[i])));
		}					
		
		printPreOrder(bTree);
	}
	
	/**
	 * If the node is greater than the tree, it gets added to right
	 * else to the left (recursively)
	 * @param tree
	 * @param n
	 */
	private static void insertNodeInTree(Node tree, Node n){
		if(greaterThan(n.value, tree.value)){
			if(tree.right==null){
				tree.right = n;
			}else{
				insertNodeInTree(tree.right, n);
			}
		}else{
			if(tree.left==null){
				tree.left = n;
			}else{
				insertNodeInTree(tree.left, n);
			}
		}		
	}
	
	/**
	 * Print the tree with pre-order traversal
	 * @param n
	 */
	private static void printPreOrder(Node n){
		System.out.print(n.value);
		if(n.left!=null){
			printPreOrder(n.left);
		}
		
		if(n.right!=null){
			printPreOrder(n.right);
		}
	}
	
	/**
	 * Method to compare two string. If s2 comes after s1 in alphabetical order,
	 * this method will return true. 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean greaterThan(String s1, String s2){
		return s1.compareTo(s2) > 0;
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