package practice.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BFS {
	
	public static Graph constructGraph() {
		int noOfVertices, noOfEdges;
		
		Graph g = null;
		
		int u, v;
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			noOfVertices = scanner.nextInt();
			noOfEdges = scanner.nextInt();
			
			g = new Graph(noOfVertices);
			
			for(int i = 0; i<noOfEdges; i++) {
				u = scanner.nextInt();
				v = scanner.nextInt();
				
				g.addEdge(u, v);
				g.addEdge(u, v);
				
				
			}
			break;
		}
		return g;
	}
	
	public static ArrayList<Integer> doBFS(Graph g, int source, int dest) {
		ArrayList<Integer> shortestPath = new ArrayList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();
		
		if(source == dest) {
			return null;
		}
		Queue<Integer> queue = new java.util.LinkedList<>();
		Stack<Integer> pathStack = new Stack<>();
		
		queue.add(source);
		pathStack.add(source);
		
		visited.put(source, true);
		
		while(!queue.isEmpty()) {
			int u = queue.poll();
			
			ArrayList<Integer> adjList = g.getOutEdges(u);
			
			for(int v: adjList) {
				if(!visited.containsKey(v)) {
					queue.add(v);
					visited.put(v, true);
					pathStack.add(v);
					if(u == dest) {
						break;
					}
				}
			}
		}
		
		int node, currentSrc = dest;
		
		shortestPath.add(dest);
		while(!pathStack.isEmpty()) {
			node = pathStack.pop();
			if(g.isNeighbor(currentSrc, node)) {
				shortestPath.add(node);
				currentSrc = node;
				if(node == currentSrc) break;
			}
		}
		
		return shortestPath;
	}
	
	/**
	 * 
	 * Method to find the shortest path
	 */
	public static void findShortestPath()
	{

		Graph graph = constructGraph();
		Scanner scanner = new Scanner(System.in);
		int source = scanner.nextInt();
		int dest = scanner.nextInt();

		ArrayList<Integer> shortestPathList =  doBFS(graph, source, dest);

		System.out.print("[ ");
		for(int node : shortestPathList)
		{
			System.out.print(node+" ");
		}
		System.out.print("]");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BFS.findShortestPath();
	}


}
