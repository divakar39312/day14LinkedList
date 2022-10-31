package com.Bridgelabz;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * creating object of linkedlist class added values throgh push method display
		 * input 56 at first the appended 30 then appended 70
		 * values through display method
		 */

		Linkedlist list = new Linkedlist();
		list.add(56);
		list.addNodeAtFirst(30);
		list.addNodeAtFirst(70);
		list.display();
	}
}
