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
	Node pre;
	Node before;
	Node after;
	Node Buffer;
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
	        Buffer = tail;
	        tail = temp;
	        length--;
		}
		return Buffer;
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
			Buffer = temp;
			temp = null;
			length--;
			
		}
		return Buffer;
	}
	
	public Node get(int index) {
		temp = head;
		if (length == 0) {
			return null;
		}
		else if (index <= length) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		else {
			return null;
		}
		return temp;
	}
	
	public Boolean set(int index, int value) {
		temp = head;
		if (length == 0) {
			return false;
		}
		else if (index <= length) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			temp.data = value;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean insert(int index, int value) {
		temp = head;
		if (index < 0 || index > length) {
			return false;
		}
		else if (index == 0) {
			prepend(value);
			length++;
			return true;
		}
		else if (index == length) {
			append(value);
			length++;
			return true;
		}
		else {
			Node newNode = new Node(value);
			for (int i = 0; i < index; i++) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = newNode;
			newNode.next = temp;
			length++;
			return true;
		}
	}
	
	public Node remove(int index) {
		temp = head;
		if (index < 0 || index > length) {
			return null;
		}
		else if (index == length) {
			Node last = removeLast();
			return last;
		}
		else if (index == 0) {
			Node first = removeFirst();
			return first;
		}
		else {
			for (int i = 0; i < index; i++) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = temp.next;
            length--;
			return temp;
		}
	}
	
	public void reverse() {
		before = null;
		temp = head;
		head = tail;
		tail = temp;
		after = temp;
		if (length == 0 || length == 1) {
			return;
		}
		else {
			for (int i = 0; i < length; i++) {
				after = temp.next;
				temp.next = before;
				before = temp;
				temp = after;
			}
		}
	}
}

// Get