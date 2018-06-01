package practice.test;

public class DoublyLinkedList {
	
	private Node head;
	
	public static void main(String[] args) {
		
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		
		if(head == null) return;
		
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}

}
