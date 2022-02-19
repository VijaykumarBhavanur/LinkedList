package com.blz.ds;

public class Queue {

	static LinkedList list = new LinkedList();
	// Adding elements: Enqueue
	// Deleting elements: Dequeue

	public void enqueue(Object data) {
		list.addLast(data);
	}

	public void dequeue() {
		list.deleteFirst();
	}

	public void show() {
		list.display();
	}
}
