package Lab1;

import java.util.HashSet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class Graph {
	protected Map<String, Set<String>> adjList;
	public Graph() {
		adjList= new LinkedHashMap<>();
	}
	public void addVertex(String v) {
		Set<String> adj= new HashSet<String>();
		this.adjList.put(v, adj);
	}
	
	public void printAdjList() {
		for (Map.Entry<String, Set<String>> entry : adjList.entrySet()) {
			System.out.println("["+ entry.getKey() + ";" + entry.getValue()+"]");
		}
	}
	
	public abstract void removeVertex(String v);
	public abstract void addEdge(String u, String v);
	public abstract void removeEdge(String u, String v);
	public abstract int degree(String v);
	public abstract int edges();
}
