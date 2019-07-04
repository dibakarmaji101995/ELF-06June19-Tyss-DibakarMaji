package com.tyss.datastructure.linearlinkedlist;

public class DeleteNodeByNodeDataInSingleLinkedList {
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

	public static void deleteNodeByNodePosition(Integer position) {
		Node temp = head;
		Node previous = null;
		// check head is deletable node or not
		if (position.equals(0)) {
			head = (Node) temp.getNext();
			return;
		}
		// take previous node reference of deletable node
		for(Integer i=0;i<position-1;++i) {
			temp=(Node) temp.getNext();
		}
		// if node data is not found then control return back to its caller method
		if (temp.getNext().equals(null)) {
			return;
		}
		// change previous node next field value to deletable node next field value
		temp.setNext(temp.getNext().getNext());
	}

	public static void main(String[] args) {
		// before delete
		RetrieveElementFronSingleLinkedList.retrieveLinkedList(head);
		// delete node by its node data
		deleteNodeByNodePosition(3);
		// after  delete
		System.out.println();
		RetrieveElementFronSingleLinkedList.retrieveLinkedList(head);

	}

}
