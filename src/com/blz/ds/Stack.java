package com.blz.ds;

public class Stack {

	static LinkedList list = new LinkedList();
	// Push : Adding elements
	// Pop : Deleteing elements

	public void push(Object data) {

		list.addFirst(data);
	}

	public void pop() {
		list.deleteFirst();
	}

	public void showElements() {
		list.display();
	}

}
