package com.blz.ds;

public class LinkedList {

	Node head;

	public class Node {

		Object data;
		Node ref;

		public Node(Object data) {
			this.data = data;
		}

	}

	public void addLast(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else if (head.ref == null)
			head.ref = newNode;
		else {
			Node temp = head;

			while (temp.ref != null) {
				temp = temp.ref;

			}

			temp.ref = newNode;

		}

	}

	public void display() {
		if (head == null)
			System.out.println("No elements to display.");
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.ref != null)
					System.out.print(temp.data + " => ");
				else
					System.out.println(temp.data);
				temp = temp.ref;
			}

		}
	}

	public void deleteFirst() {
		if (head == null)
			System.out.println("Nothing to delete..");
		else {
			head = head.ref;
		}

	}

	public void addFirst(Object data) {

		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.ref = head;
			head = newNode;
		}
	}

	public void deleteLast() {

		if (head == null)
			System.out.println("No elements to delete");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;

			while (temp.ref.ref != null) {
				temp = temp.ref;
			}

			temp.ref = null;

		}

	}

	public void search(Object data) {

		boolean isFound = false;

		if (head == null)
			System.out.println("No elements to search");

		else if (head.data == data)
			isFound = true;

		else {

			Node temp = head;
			while (temp != null) {

				if (temp.data == data) {
					isFound = true;
					break;
				}

				temp = temp.ref;

			}

		}

		if (isFound)
			System.out.println("Data found ");
		else
			System.out.println(data + " not found");

	}

	public int getSize() {
		int count = 0;

		if (head == null)
			return count;

		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.ref;
		}

		return count;

	}

}