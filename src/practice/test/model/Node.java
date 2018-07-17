package practice.test.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private int data;
	private List<Node> neighbors;
	private boolean isVisited;
	
	public Node(int data) {
		this.data = data;
		this.neighbors = new ArrayList<>();
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public List<Node> getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbors(List<Node> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	public void addneighbours(Node n) {
		neighbors.add(n);
	}
	
}
