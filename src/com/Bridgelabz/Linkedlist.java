package com.Bridgelabz;


public class Linkedlist<T> {

	Node head;
	Node tail;

	/**
	 * 
	 * @param data
	 */

	public void add(int data) {
		/**
		 * checkinh wheather linkedlist is empty or not if empty creating new node
		 * (adding)
		 */
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

//	public void addNodeAtFirst(int data) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			tail = newNode;
//		} else
//			newNode.next = head;
//		    head = newNode;
//	}

	public void display() {
		/**
		 * displaying the data(s) from node(s)
		 */
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("\n");
	}

//	public void push(int data) {
//		/**
//		 * adding values
//		 */
//        Node newNode = new Node(data);
//        if (head == null){
//            head = newNode;
//            tail = newNode;
//        }
//        else {
//            newNode.next = head;
//            head = newNode;
//        }
//    }

//	public void insertBetween( int data, int newNode) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			tail = newNode;
//		Node tempNode = prevNode.next;
//		prevNode.next = newNode;
//		newNode.next = tempNode;
//	}



	public Object pop(int data) {
		/**
		 * finding second last node as temp
		 * and temp.next means the last node defined as null
		 * 
		 */
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;

		temp.next = null;

		return head;
	}
}