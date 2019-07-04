package com.tyss.datastructure.linearlinkedlist;

public class InsertNewElementToSingleLinkedList {
	private static Node head;
	private static Node node2;
	private static Node node3;
	private static Node node4;
	static {
		// create head
		head = new Node(1);

		// create nodes
		node2 = new Node(2);
		node3 = new Node(3);
		node4 = new Node(4);
		// head next element point to node 1
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
	}

	public static Boolean insertAtFirst(Node node) {
		Node temp=null;
		if (node != null) {
			temp=head;
			head=node;
			head.setNext(temp);
			temp.setNext(node2);
			return true;
		}
		return false;
	}
	public static Boolean insertAtSpecificNodePosition(Node node,Node specificNodePosition) {
		if (node != null) {
			node2.setNext(node);
			node.setNext(specificNodePosition);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
          //insert new element to first of linear linked list
		insertAtFirst(new Node(8));
	     //insert at specific node position
		insertAtSpecificNodePosition(new Node(10),node3);
		//retrieve all elements and display them to console
		RetrieveElementFronSingleLinkedList.retrieveLinkedList(head);
	}
}
