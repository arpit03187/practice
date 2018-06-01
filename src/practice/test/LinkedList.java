package practice.test;

import java.util.HashSet;

public class LinkedList {

	private Node head;

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node n1 = list.addNode(1);
		Node n2 = list.addNode(3);
		Node n3 = list.addNode(2);
		Node n4 = list.addNode(5);
		Node n5 = list.addNode(6);
		Node n6 = list.addNode(7);
		System.out.println("List before deletion");
		System.out.println("-------------------------------");
		list.traverse();
//		 list.deleteNode(3);
//		 System.out.println("-------------------------------");
//		 System.out.println("List After deletion");
//		 System.out.println("-------------------------------");
//		 list.traverse();
//
//		list.printMiddle();
//		
//		list.removeDuplicate();
//		
//		list.traverse();
		
		list.reverseList(n6);
		
		list.traverse();
		
	}

	/**
	 * Adds a new node at the end of 
	 * @param data
	 */
	public Node addNode(int data) {

		if (head == null) {
			head = new Node(data);
			return head;
		}

		Node node = head;

		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(data);
		return node;
	}

	/**
	 * Traverses the list and prints all the elements
	 */
	public void traverse() {
		if (head == null)
			return;

		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	/**
	 * Prepends a node to the head of the linked list
	 * @param data
	 */
	public void prepend(int data) {
		if (head == null)
			return;

		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	/**
	 * Deletes a node from the linked list
	 * @param key
	 */
	void deleteNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
	}

	/**
	 * Prints the middle element of the list
	 */
	void printMiddle() {
		Node fast_ptr = head;
		Node slow_prt = head;

		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_prt = slow_prt.next;
			}

			System.out.println("Middle element is [" + slow_prt.data + "]");
		}
	}

	/**
	 * Reverse a linked list
	 * @param node
	 * @return
	 */
	Node reverseList(Node node) {
		Node current = head, prev = null, next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	/**
	 * Remove duplicates from linked list
	 */
	void removeDuplicate() 
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();
     
        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) 
        {
            int curval = current.data;
             
             // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
 
    }

}
