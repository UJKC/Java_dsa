package section4;
import section4.LinkedList;
import section4.Node;

public class Main {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
	}
}
