package practice.test;

import java.util.List;
import java.util.Stack;
import practice.test.model.Node;

public class DepthFirstSearch {

	public static void dfsIterative(Node node) {

		Stack<Node> stack = new Stack<>();

		stack.push(node);
		node.setVisited(true);

		while (!stack.isEmpty()) {
			Node element = stack.pop();

			System.out.print(element.getData() + " ");

			List<Node> neighbors = element.getNeighbors();

			for (int i = 0; i < neighbors.size(); i++) {

				if (neighbors.get(i) != null && !neighbors.get(i).isVisited()) {
					stack.push(neighbors.get(i));
					neighbors.get(i).setVisited(true);
				}
			}
		}

	}
	
	public static void dfsRecursive(Node node) {
		System.out.print(node.getData() + " ");
		
		List<Node> neighbors = node.getNeighbors();
		
		node.setVisited(true);
		
		for (int i = 0; i < neighbors.size(); i++) {
			if (neighbors.get(i) != null && !neighbors.get(i).isVisited()) {
				dfsRecursive(neighbors.get(i));
			}
		}
	}

	public static void main(String[] args) {
		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);
		
		dfsIterative(node40);
		
		node40.setVisited(false);
		node10.setVisited(false);
		node20.setVisited(false);
		node30.setVisited(false);
		node60.setVisited(false);
		node50.setVisited(false);
		node70.setVisited(false);
		
		System.out.println(" ");
		
		dfsRecursive(node40);
	}

}
