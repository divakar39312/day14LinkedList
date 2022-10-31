package com.Bridgelabz;

public class Main {
	

	public static void main(String[] args) {
		/**
		 * creating object of linkedlist class 
		 * added values throgh add method and display 56 > 30 > 56
		 * then using pop method deleting Node data means first data then printing 30 > 70
		 * 
		 */

		Linkedlist list = new Linkedlist();
		list.add(56);
		list.add(30);
		list.add(70);
		list.display();
		list.pop(56);
		list.display();

	}
}
