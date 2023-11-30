package section4;
import section4.LinkedList;
import section4.Node;

public class Main {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
       
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().data);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().data);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
	}
}
