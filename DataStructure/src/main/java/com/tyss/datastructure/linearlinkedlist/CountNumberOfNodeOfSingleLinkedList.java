package com.tyss.datastructure.linearlinkedlist;

public class CountNumberOfNodeOfSingleLinkedList {
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
	public static Integer countNode(Node head) {
		if(head==null) {
			return 0;
		}
		return 1+countNode(head.getNext());
	}
	public static void main(String[] args) {
		System.out.println("Number of node of single linked list::"+countNode(head));

	}

}
