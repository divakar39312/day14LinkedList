package com.Bridgelabz;

public class Main {
	


	public static void main(String[] args) {
		/**
		 * creating object of linkedlist class 
		 * added values throgh add method and display 56 > 70
		 * using pop method deleting Node data and add 30 in between
		 * 
		 */
		Linkedlist<Object> list = new Linkedlist<Object>();
		list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.display();
        list.sortList();
        list.display();
	}
	
}
