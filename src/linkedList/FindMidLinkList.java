package linkedList;

public class FindMidLinkList {

	Node head;

	boolean isEmpty() {

		boolean isEmpty = false;

		if (head == null)
			isEmpty = true;

		return isEmpty;

	}

	public static void main(String args[]) {

		FindMidLinkList findMidLinkList = new FindMidLinkList();

		findMidLinkList.insertNodeatBeg(1);
		findMidLinkList.insertNodeatBeg(2);
		findMidLinkList.insertNodeatBeg(3);
		findMidLinkList.insertNodeatBeg(4);
		findMidLinkList.insertNodeatBeg(5);
		findMidLinkList.insertNodeatBeg(6);
		findMidLinkList.printLinkedList();
		//findMidLinkList.findMidNode();
		findMidLinkList.nthFromLastNode(3);
	}

	
	public Node nthFromLastNode(int n)
	{
		Node firstPtr=head;
		Node secondPtr=head;
 
		for (int i = 0; i < n; i++) {
			firstPtr=firstPtr.next;
 
		}
 
		while(firstPtr!=null)
		{
			firstPtr=firstPtr.next;
			secondPtr=secondPtr.next;
		}
 
		return secondPtr;
	}
	

	private void findMidNode() {
		
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer!=null){
			fastPointer = fastPointer.next;
			
			if(fastPointer !=null && fastPointer.next!=null){
				fastPointer = fastPointer.next;
				slowPointer = slowPointer.next;
			}
			
		}
		
		System.out.println("Middle Element is "+ slowPointer.data);
		
		
		
	}

	private void printLinkedList() {
		
		Node temp = head;
		
		while(temp!=null){
			
			System.out.println(temp.data);
			
			temp = temp.next;
		}
		
	}

	private void insertNodeatBeg(int i) {
		
		Node newNode = new Node();
		newNode.data = i;
		
		newNode.next = head;
		head = newNode;
	}

}
