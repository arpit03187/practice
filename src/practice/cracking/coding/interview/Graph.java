package practice.cracking.coding.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
	
	enum State { Unvisited, Visited, Visiting; } 
	
	private Map<Integer, Node> nodeLookUp = new HashMap<>();
	
	public static class Node {
		
		private int id;
		private LinkedList<Node> adjacent = new LinkedList<>();
		State state;
		
		private Node(int id) {
			this.id = id;
		}
	}
	
	public Node getNode(int d) {
		return nodeLookUp.get(d);
	}
	
	public void addEdge(int source, int dest) {
		Node s = getNode(source);
		Node d = getNode(dest);
		
		s.adjacent.add(d);
	}
	
	public boolean hasPathDFS(int source, int dest) {
		Node s = getNode(source);
		Node d = getNode(dest);
		
		HashSet<Integer> visited = new HashSet<>();
		
		return hasPathDFS(s, d, visited);
	}
	
	private boolean hasPathDFS(Node source, Node dest, HashSet<Integer> visited) {
		if(visited.contains(source)) return false;
		
		visited.add(source.id);
		
		if(source == dest) return true;
		
		for(Node child: source.adjacent) {
			if(hasPathDFS(source, dest, visited)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean hasPathBFS(Node source, Node dest) {
		LinkedList<Node> nextToVisit = new LinkedList<>();
		
		
		HashSet<Integer> visited = new HashSet<>();
		
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty()) {
			Node node = nextToVisit.remove();
			
			if(source == dest) {
				return true;
			}
			
			if(visited.contains(node.id)) {
				continue;
			}
			visited.add(node.id);
			
			for(Node child: node.adjacent) {
				nextToVisit.add(child);
			}
		}
		return false;
	}
	
	private boolean search(Graph g, Node start, Node end) {
		
		if(start == end) return true;
		
		LinkedList<Node> q = new LinkedList<>();
		
		for(Node u: g.getNode(start.id).adjacent) {
			
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		
		q.add(start);
		Node u;
		
		while(!q.isEmpty()) {
			u = q.removeFirst();
			
			if(u != null) {
				for(Node v: u.adjacent) {
					if(v.state == State.Unvisited) {
						if(v == end) { return true; }
						else {
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;	
			}
		}
		return false;
	}

}
