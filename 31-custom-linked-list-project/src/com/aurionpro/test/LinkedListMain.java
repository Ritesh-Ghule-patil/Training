package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;

public class LinkedListMain {
	public static void main(String[] args) {

		var ll = new CustomLinkedList();

		ll.insertFirst(50);
		ll.insertFirst(40);
		ll.insertFirst(30);

		ll.insertLast(60);
		ll.insertLast(70);

		ll.insert(10, 0);
		ll.insert(50, 5);

		System.out.println("\n---------- Display Linked List ----------\n");
		ll.display();

		System.out.println("\nDeleted First Item : " + ll.deleteFirst());

		System.out.println("\n--------- Display Linked List -----------\n");
		ll.display();

		System.out.println("\nDeleted Last Item : " + ll.deleteLast());

		System.out.println("\n--------- Display Linked List ------------\n");
		ll.display();

		System.out.println("\nDeleting item at 2nd position : " + ll.delete(2));

		System.out.println("\n------- Display Linked List --------------\n");
		ll.display();

		System.out.println("\n----- iterating Using forEach Loop ------\n");

		for (int node : ll) {
			System.out.println(node);
		}

		System.out.println("\n------ Iterate Using Java-8 forEach -----\n");
		ll.forEach(a -> System.out.println(a));

		System.out.println("\n------ Iterate Using Iterator -----------\n");

//		Iterator<Integer> it = ll.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		System.out.print("\nSize Of Linked List : ");
		System.out.println(ll.getSize());

	}

}
