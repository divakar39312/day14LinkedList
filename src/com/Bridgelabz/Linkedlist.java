package com.Bridgelabz;

public class Linkedlist {

	Node head;
	Node tail;
	/**
	 * 
	 * @param data
	 */

	public void add(int data) {
		/**
		 * checkinh wheather linkedlist is empty or not
		 * if empty creating new node (adding)
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

	public void display() {
		/**
		 * displaying the data(s) from node(s)
		 */
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
}
