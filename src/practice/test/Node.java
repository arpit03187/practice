package practice.test;

public class Node {

	int data;
	Node next;
	Node prev;

	public Node(int data) {
		this.data = data;
	}

	/**
	 * @param data
	 * @param next
	 */
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

}
