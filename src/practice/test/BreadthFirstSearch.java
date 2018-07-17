package practice.test;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

import practice.test.model.Node ;

public class BreadthFirstSearch {
	
	public static void bfs(Node node) {
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(node);
		node.setVisited(true);
		
		while(!queue.isEmpty()) {
			
			Node element = queue.poll();
			
			System.out.print(element.getData() + " ");
			
			List<Node> neighbors = element.getNeighbors();
			
			for(int i = 0; i < neighbors.size(); i++) {
				
				Node n = neighbors.get(i);
				if(n != null && !n.isVisited()) {
					queue.add(n);
					n.setVisited(true);
				}
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
		
		bfs(node40);
	}

}
