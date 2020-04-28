package linkedList;

public class CustomLinkedList {
	private Node head;

	public static void main(String args[]) {

		CustomLinkedList customLinkedList = new CustomLinkedList();
		customLinkedList.insertNode(7);
		customLinkedList.insertNode(5);
		customLinkedList.insertNode(6);
		customLinkedList.insertNode(2);
		customLinkedList.print(customLinkedList);
		customLinkedList.deleteFirstNode();
		System.out.println("After Deleting first Element");
		customLinkedList.print(customLinkedList);
		System.out.println("After Deleting first Element");
		customLinkedList.insertLastNode();
		System.out.println("After Inserting Record after the last node");
		customLinkedList.print(customLinkedList);
		System.out.println("delete node after particular Node");
		customLinkedList.deleteAfterNode(5);
		customLinkedList.print(customLinkedList);
		Node reverseHead=customLinkedList.reverseLinkedList(customLinkedList.head);
		System.out.println("after reversing");
		customLinkedList.printList(reverseHead);

	}

/*	1->2->3
	3->2->1*/
	
	
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node reverseLinkedList(Node currentNode)
	{
		// For first node, previousNode will be null
		Node previousNode=null;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			// reversing the link
			currentNode.next=previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode=currentNode;
			currentNode=nextNode;
		}
		return previousNode;
	}

	private void deleteAfterNode(int i) {
		Node temp = head;

		while (temp.next != null) {
			if (temp.data == i) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}

	}

	private void insertLastNode() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node();
		newNode.data = 4;
		newNode.next = null;
		temp.next = newNode;
	}

	private void deleteFirstNode() {
		Node temp = head;
		head = head.next;
	}

	private void print(CustomLinkedList customLinkedList) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	// Inserts Node in the beginning of the linked list
	private void insertNode(int i) {
		Node newNode = new Node();
		newNode.data = i;
		newNode.next = head;
		head = newNode;

	}

}
