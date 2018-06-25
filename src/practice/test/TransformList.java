package practice.test;

import java.util.List;
import java.util.LinkedList;

/**
 * 
 * @author arpit.srivastava
 * 
 *         a->b->c->d->e 
 *         b->a->d->c->e
 *
 */
public class TransformList {

	public static void main(String[] args) {
		
		Node e = new Node(null, 'e');
		Node d = new Node(e, 'd');
		Node c = new Node(d, 'c');
		Node b = new Node(c, 'b');
		Node a = new Node(b, 'a');
		
		List<Node> nodes = new LinkedList<>();
		nodes.add(a);
		nodes.add(b);
		nodes.add(c);
		nodes.add(d);
		nodes.add(e);
		
		for(Node n: nodes) {
			System.out.print(n.data);
			if(n.next != null)
				System.out.print("->");
		}
		
		System.out.println();
		
		transform(a);
		List<Node> nodes2 = new LinkedList<>();
		nodes2.add(a);
		nodes2.add(b);
		nodes2.add(c);
		nodes2.add(d);
		nodes2.add(e);
		
		for(Node n: nodes2) {
			System.out.print(n.data);
			if(n.next != null)
			System.out.print("->");
		}
		
	}
	
	public static void transform(Node head) {
		
		Node n = head;
		while(n != null && n.next != null) {
			char temp = n.data;
			n.data = n.next.data;
			n.next.data = temp;
			
			n = n.next.next;
		}
		
	}
	
	private static class Node {
		Node next;
		char data;
		
		Node(Node next, char data) {
			this.next = next;
			this.data = data;
		}
	}

}
