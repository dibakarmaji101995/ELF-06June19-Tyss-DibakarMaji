package com.tyss.datastructure.linearlinkedlist;



public class AddAndDisplaySingleLinkedList {
	private static Node head;
	
	static{
		// create head
	    head = new Node(1);
	    Node node2 = null;
		Node node3 = null;
		Node node4 = null;
		
		// create nodes
		node2=new Node(2);
		node3=new Node(3);
		node4=new Node(4);
		//head next element point to node 1
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
	}
	public static void main(String[] args) {
		//retrieve node data and display them to console
		RetrieveElementFronSingleLinkedList.retrieveLinkedList(head);

	}
	
}
