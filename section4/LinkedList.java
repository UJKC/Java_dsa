package section4;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	Node head;
	Node tail;
	Node temp;
	int length;
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head: " + head.data);
	}
	
	public void getTail() {
		System.out.println("Tail: " + tail.data);
	}
	
	public void getLength() {
		System.out.println("Length: " + length);
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		temp = head;
		if (length == 0) {
			return null;
		}
		else if (length == 1) {
			temp = null;
			tail = null;
			length--;
		}
		else {
			while (temp.next != tail) {
	            temp = temp.next;
	        }
	        temp.next = null;
	        tail = temp;
	        length--;
		}
		return tail;
	}
}
