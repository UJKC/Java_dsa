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
			head = null;
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
	
	public Node prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
			length++;
		}
		else {
			newNode.next = head;
			head = newNode;
			length++;
		}
		return head;
	}
	
	public Node removeFirst() {
		temp = head;
		if (length == 0) {
			return null;
		}
		else if (length == 1) {
			head = null;
			tail = null;
			length--;
		}
		else {
			head = head.next;
			temp.next = null;
			temp = null;
			length--;
			
		}
		return head;
	}
}
