package com.tyss.datastructure.linearlinkedlist;

public class RetrieveElementFronSingleLinkedList {
	private RetrieveElementFronSingleLinkedList() {
		
	}
	public static void retrieveLinkedList(Node head) {
		Node n=head;
		while(n!=null) {
			System.out.print(n.getData()+" ");
			n=(Node) n.getNext();
		}
	}
}
